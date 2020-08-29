package com.example.demo;

import com.example.demo.interfaces.DiDi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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
    private DiDi didi;

    @GetMapping("/consumer")
    public String consumption(){

        return didi.consumer();
    }

}
