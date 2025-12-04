package com.nitere.cloud.interviews.juc.countdownlatch;

public class DatabaseStartupTask implements StartupTask {
    @Override
    public String getName() {
        return "Database";
    }

    @Override
    public void runStartup() throws Exception {
        System.out.println("[Startup] 初始化資料庫連線...");
        // 這裡可以放資料庫連線、Flyway migration 等
        Thread.sleep(3000);
        System.out.println("[Startup] 資料庫就緒");
    }
}
