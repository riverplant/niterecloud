package com.nitere.cloud.interviews.juc.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class SimpleCyclicBarrierDemo {

    public static void main(String[] args) {
        int workers = 3;

        CyclicBarrier barrier = new CyclicBarrier(workers, () -> {
            // 所有 worker 完成 Phase 1 後會先執行這一段
            System.out.println("===> 所有工作線程已完成 Phase 1，開始進入 Phase 2");
        });

        for (int i = 0; i < workers; i++) {
            int id = i;
            new Thread(() -> {
                try {
                    System.out.println("工人 " + id + "：開始 Phase 1");
                    Thread.sleep(1000L + (long) (Math.random() * 2000));
                    System.out.println("工人 " + id + "：完成 Phase 1，等待其他人...");

                    barrier.await(); // 在這裡等其它工人

                    System.out.println("工人 " + id + "：開始 Phase 2");
                    Thread.sleep(1000L + (long) (Math.random() * 2000));
                    System.out.println("工人 " + id + "：完成 Phase 2");

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } catch (BrokenBarrierException e) {
                    System.out.println("工人 " + id + "：柵欄被打破，結束工作");
                }
            }).start();
        }
    }
}
