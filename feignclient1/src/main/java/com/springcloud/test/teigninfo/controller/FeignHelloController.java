package com.springcloud.test.teigninfo.controller;

import com.springcloud.test.teigninfo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignHelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/feign-hello")
    public String getNodeInfo() throws Exception {
        return helloService.getMessage();
    }

}
