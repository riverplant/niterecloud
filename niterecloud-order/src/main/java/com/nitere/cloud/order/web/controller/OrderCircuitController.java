package com.nitere.cloud.order.web.controller;

import com.nitere.cloud.commons.web.controller.feign.ProductionFeignApi;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String myCircuitFallback(Throwable t) {
        log.error("[OrderCircuitController][myCircuit][myCircuitFallback]: 系統繁忙，請稍後再試");
        return "myCircuitFallback, 系統繁忙，請稍後再試-------";
    }


    @GetMapping(value = "/production/bulkhead/{id}")
    @Bulkhead(name = "nitere-cloud-production", fallbackMethod = "myBulkheadFallback")
    public String bulkhead(@PathVariable("id") Long id){
        return productionFeignApi.bulkhead(id);
    }

    //服務降級后的兜底方法
    public String myBulkheadFallback(Throwable t) {
        log.error("[OrderCircuitController][bulkhead][myBulkheadFallback]: 系統繁忙，請稍後再試");
        return "myBulkheadFallback, 艙壁超出最大訪問呢數量限制, 系統繁忙，請稍後再試-------";
    }

}
