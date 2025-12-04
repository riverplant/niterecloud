package com.nitere.cloud.interviews.juc.semahpore;

import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

@Slf4j
public class ExternalApiClient {
    private final Semaphore semaphore;
    private final Duration acquireTimeout;

    public ExternalApiClient(int maxConcurrentRequests, Duration acquireTimeout) {
        if (maxConcurrentRequests <= 0) {
            throw new IllegalArgumentException("maxConcurrentRequests must be > 0");
        }
        this.semaphore = new Semaphore(maxConcurrentRequests, true);
        this.acquireTimeout = Objects.requireNonNull(acquireTimeout);
    }


    public String callExternal(String payload) throws ExternalCallRejectedException {
        boolean acquire = false;
        try {
            acquire = semaphore.tryAcquire(acquireTimeout.toMillis(), TimeUnit.MILLISECONDS);
            if (!acquire) {
                // 限流：在等待時間內仍拿不到 permit，就拒絕
                log.warn("Too many concurrent requests, reject this call. payload={}", payload);
                throw new ExternalCallRejectedException("Too many concurrent requests, please retry later");
            }
            long start = System.currentTimeMillis();
            String response = doHttpCall(payload);
            long cost = System.currentTimeMillis() - start;
            log.info("External call success, cost={}ms, payload={}", cost, payload);
            return response;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new ExternalCallRejectedException("Thread interrupted while waiting for permit", e);
        } finally {
            if (acquire)
                semaphore.release();
        }
    };

    // 真正調 HTTP（這裡用 sleep 來模擬）
    public String doHttpCall(String payload) {
        try {
            Thread.sleep(1000L + (long) (Math.random() * 500));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "OK:" + payload;
    }

    public static class ExternalCallRejectedException extends Exception {
        public ExternalCallRejectedException(String message) {
            super(message);
        }

        public ExternalCallRejectedException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
