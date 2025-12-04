package com.nitere.cloud.interviews.juc.countdownlatch;

public class MessageBrokerStartupTask implements StartupTask {
    @Override
    public String getName() {
        return "MessageBroker";
    }

    @Override
    public void runStartup() throws Exception {
        System.out.println("[Startup] 初始化訊息中介 (MQ)...");
        Thread.sleep(4000);
        System.out.println("[Startup] 訊息中介就緒");
    }
}
