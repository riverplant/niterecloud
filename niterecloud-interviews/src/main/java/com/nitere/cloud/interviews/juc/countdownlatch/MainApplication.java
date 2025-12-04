package com.nitere.cloud.interviews.juc.countdownlatch;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Slf4j
public class MainApplication {
    public static void main(String[] args) {
        List<StartupTask> tasks = List.of(
                new DatabaseStartupTask(),
                new CacheStartupTask(),
                new MessageBrokerStartupTask()
        );

        ApplicationStartupManager manager = new ApplicationStartupManager(tasks);

        try {
            manager.await(30, TimeUnit.SECONDS);
            log.info("==> 所有子系統就緒，應用可以對外提供服務");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (TimeoutException e) {
            log.error("==> 啟動超時，應用不對外開放，請檢查子系統狀態");
            throw new IllegalStateException("Startup timed out", e);
        } finally {
            manager.shutdwon();
        }
    }
}
