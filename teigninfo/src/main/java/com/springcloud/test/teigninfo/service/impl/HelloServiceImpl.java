package com.springcloud.test.teigninfo.service.impl;

import com.springcloud.test.teigninfo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;
@RestController
public class HelloServiceImpl implements HelloService {

    @Autowired
    private Environment environment;

    @Override
    public String getMessage() {
        return environment.getProperty("spring.application.name") + ":" + environment.getProperty("server.port", "8080");
    }
}