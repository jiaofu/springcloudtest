package com.springcloud.test.ribbonweb.controller;



import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class WebController {

    @Autowired private RestTemplate restTemplate;
    @Autowired private LoadBalancerClient loadBalancerClient;

    @GetMapping("/test")
    public String test() {
        String result = restTemplate.getForObject("http://ribbon-client/v1/123",String.class);
        System.out.println(result);
        return result;
    }

    @GetMapping("/test2")
    public String test2() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("ribbon-client");
        String result = serviceInstance.getServiceId() + ":" + serviceInstance.getHost() + ":" + serviceInstance.getPort();
        System.out.println(result);
        return result;
    }





}
