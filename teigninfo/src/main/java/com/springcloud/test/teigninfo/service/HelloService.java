package com.springcloud.test.teigninfo.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-server")
public interface HelloService {

    @RequestMapping("/hello")
    String getMessage() throws Exception;

}