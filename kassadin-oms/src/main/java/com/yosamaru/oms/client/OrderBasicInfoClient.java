package com.yosamaru.oms.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(value = "cms")
public interface OrderBasicInfoClient {
    @GetMapping(value = "help-category-do/get-all-order-item")
    List<String> getAllOrderItem();
}
