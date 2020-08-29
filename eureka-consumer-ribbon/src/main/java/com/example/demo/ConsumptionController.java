package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConsumptionController
 * @Description TODO
 * @Author yaoyp
 * @Date 2020-08-29 15:43
 * @Version 1.0
 */

@RestController
public class ConsumptionController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String consumption(){

        return restTemplate.getForObject("http://eureka-client1/didi", String.class);
    }

}
