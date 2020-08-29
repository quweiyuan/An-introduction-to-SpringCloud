package com.example.demo.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client1")
public interface DiDi {

    @GetMapping("/didi")
    String consumer();
}
