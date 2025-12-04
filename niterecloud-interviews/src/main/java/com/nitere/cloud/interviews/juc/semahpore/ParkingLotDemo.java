package com.nitere.cloud.interviews.juc.semahpore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class ParkingLotDemo {

    public static void main(String[] args) {
        int parkingSpaces = 3;          // 停車位數量
        Semaphore semaphore = new Semaphore(parkingSpaces, true); // 公平停車場

        ExecutorService pool = Executors.newFixedThreadPool(10);

        for (int carId = 1; carId <= 10; carId++) {
            int id = carId;
            pool.submit(() -> {
                try {
                    System.out.println("車 " + id + " 到達停車場，嘗試停車...");

                    semaphore.acquire(); // 沒位子會在這裡阻塞
                    System.out.println(">> 車 " + id + " 停進去了（剩餘位子：" 
                            + semaphore.availablePermits() + "）");

                    // 模擬停車一段時間
                    TimeUnit.SECONDS.sleep(2);

                    System.out.println("<< 車 " + id + " 開走了");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    // 很重要：一定要在 finally 裡 release
                    semaphore.release();
                }
            });
        }

        pool.shutdown();
    }
}
