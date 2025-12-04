package com.nitere.cloud.interviews.juc.cyclicBarrier;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;
import java.util.concurrent.atomic.LongAdder;

@Slf4j
public class BatchProcessingWithBarrier {

    private static final int WORKERS = 4;
    private static final int BATCHES = 3;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(WORKERS);
        ConcurrentMap<Integer, LongAdder> batchProcessedMap = new ConcurrentHashMap<>();

        CyclicBarrier cyclicBarrier = new CyclicBarrier(
                WORKERS,
                () -> { // barrierAction：當這一批所有 worker 都完成時執行,才統一進入下一步
                    long sum = batchProcessedMap.values()
                            .stream()
                            .mapToLong(LongAdder::sum)
                            .sum();

                    log.info("[Barrier] 當前批次所有 worker 總處理筆數 = {}", sum);
                    // 清空，準備下一批
                    batchProcessedMap.clear();
                }
        );

        for (int workId = 0; workId < WORKERS; workId++) {
            int id = workId;
            executor.submit(() -> {
                long processed;
                for (int batch = 1; batch <= BATCHES; batch++) {
                    try {
                        processed = processBatch(id, batch);
                    } catch (InterruptedException e) {
                        // 1. 恢復中斷標記
                        Thread.currentThread().interrupt();
                        // 2. 記錄日誌，然後停止這個 worker
                        log.warn("Worker-{} 在處理 batch-{} 時被中斷，停止後續批次", id, batch, e);
                        return; // 或者 break，看你的設計
                    }
                    batchProcessedMap.computeIfAbsent(id, k -> new LongAdder())
                            .add(processed);

                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        log.warn("Worker-{} 在 await 時被中斷，結束任務", id, e);
                        return;
                    } catch (BrokenBarrierException e) {
                        log.warn("Worker-{}：Barrier 被打破，結束後續批次", id, e);
                        return;
                    }

                }
            });
        }
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.MINUTES);
        System.out.println("所有批次處理完成");
    }


    // 模擬處理一批資料，返回本 worker 這一批處理了多少筆
    private static long processBatch(int workerId, int batchNo) throws InterruptedException {
        // 真實情況：查 DB / 調 API / 做計算...
        Thread.sleep(800L + (long) (Math.random() * 800));
        return 100L + workerId * 10L + batchNo;
    }
}
