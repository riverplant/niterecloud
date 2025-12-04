package com.nitere.cloud.interviews.juc.countdownlatch;

//定義啟動任務介面
public interface StartupTask {
    String getName();

    void runStartup() throws Exception;
}
