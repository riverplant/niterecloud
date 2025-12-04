package com.nitere.cloud.interviews.juc.countdownlatch;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.*;

/**
 * 啓動管理器
 */
@Slf4j
public class ApplicationStartupManager {
    private final ExecutorService executorService;
    private final CountDownLatch countDownLatch;

    public ApplicationStartupManager(List<StartupTask> tasks) {
        Objects.requireNonNull(tasks, "tasks must not be null");
        if (tasks.isEmpty()) {
            throw new IllegalArgumentException("tasks must not be empty");
        }

        this.executorService = Executors.newFixedThreadPool(tasks.size());
        this.countDownLatch = new CountDownLatch(tasks.size());

        for (StartupTask task : tasks) {
            executorService.submit(() -> {
                try {
                    log.info("[Startup] 開始：{}", task.getName());
                    task.runStartup();
                    log.info("[Startup] 完成：{}", task.getName());
                } catch (Exception e) {
                    log.error("[Startup] 失敗：{}", task.getName());
                } finally {
                    countDownLatch.countDown();
                }
            });
        }
    }

    public void await(long timeout, TimeUnit unit) throws InterruptedException, TimeoutException {
        boolean done = countDownLatch.await(timeout, unit);
        if (!done) {
            throw new TimeoutException("Startup did not finish within " + timeout + " " + unit);
        }
    }

    public void shutdwon() {
        executorService.shutdown();
    }
}
