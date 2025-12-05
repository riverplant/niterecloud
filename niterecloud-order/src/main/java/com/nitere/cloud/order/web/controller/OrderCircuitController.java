package com.nitere.cloud.order.web.controller;

import com.nitere.cloud.commons.web.controller.feign.ProductionFeignApi;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/order/feign")
public class OrderCircuitController {
    private final ProductionFeignApi productionFeignApi;

    @GetMapping(value = "/production/circuit/{id}")
    @CircuitBreaker(name = "nitere-cloud-production", fallbackMethod = "myCircuitFallback")
    public String myCircuit(@PathVariable("id") Long id) {

        return productionFeignApi.myCircuit(id);
    }

    //服務降級后的兜底方法
    public String myCircuitFallback(Long id, Throwable t) {
        log.error("[OrderCircuitController][myCircuit][myCircuitFallback]: 系統繁忙，請稍後再試");
        return "myCircuitFallback, 系統繁忙，請稍後再試-------";
    }

    //semaphore艙壁隔離
    @GetMapping(value = "/production/bulkhead/{id}")
    @Bulkhead(name = "prod-semaphore", fallbackMethod = "myBulkheadFallback", type = Bulkhead.Type.SEMAPHORE)
    public String bulkhead(@PathVariable("id") Long id) {
        return productionFeignApi.bulkhead(id);
    }

    //ThreadPool艙壁隔離
    @GetMapping(value = "/production/bulkheadpool/{id}")
    @Bulkhead(name = "prod-threadpool", fallbackMethod = "myBulkheadPoolFallback", type = Bulkhead.Type.THREADPOOL)
    public CompletableFuture<String> threadPoolBulkhead(@PathVariable("id") Long id) {
        log.info("{}\t----------------------", Thread.currentThread().getName() + "---開始進入");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return CompletableFuture.supplyAsync(() -> productionFeignApi.bulkhead(id) + "\t" + "Bulkhead.Type.THREADPOOL");
    }

    //服務降級后的兜底方法
    public String myBulkheadFallback(Long id, Throwable t) {
        log.error("[myBulkheadFallback] id={}, error={}", id, t.toString());
        return "myBulkheadFallback, 艙壁超出最大訪問呢數量限制, 系統繁忙，請稍後再試-------";
    }

    //服務降級后的兜底方法
    public CompletableFuture<String> myBulkheadPoolFallback(Long id, Throwable t) {
        log.error("[myBulkheadPoolFallback] id={}, error={}", id, t.toString());
        return CompletableFuture.supplyAsync(() -> "myBulkheadPoolFallback, 艙壁超出最大訪問呢數量限制, 系統繁忙，請稍後再試-------");
    }


    @GetMapping(value = "/production/ratelimit/{id}")
    @RateLimiter(name = "pro-ratelimiter", fallbackMethod = "myRatelimitFallback")
    public String myRatelimit(@PathVariable("id") Long id) {
        return productionFeignApi.myRatelimit(id);
    }

    public String myRatelimitFallback(Long id, Throwable t) {
        log.error("[myRatelimitFallback] id={}, error={}", id, t.toString());
        return "myBulkheadFallback, 你被限流了，禁止訪問-------";
    }

}
