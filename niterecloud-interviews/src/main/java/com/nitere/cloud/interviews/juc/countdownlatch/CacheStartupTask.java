package com.nitere.cloud.interviews.juc.countdownlatch;

public class CacheStartupTask implements StartupTask {
    @Override
    public String getName() {
        return "Cache";
    }

    @Override
    public void runStartup() throws Exception {
        System.out.println("[Startup] 初始化緩存服務...");
        Thread.sleep(1500);
        System.out.println("[Startup] 緩存就緒");
    }
}
