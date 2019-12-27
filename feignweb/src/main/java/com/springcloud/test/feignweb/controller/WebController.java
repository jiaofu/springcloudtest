package com.springcloud.test.feignweb.controller;


import com.springcloud.test.feignweb.dto.TestParam;
import com.springcloud.test.feignweb.server.IMyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {

    @Autowired private IMyFeignClient myFeignClient;

    @GetMapping("/test")
    public String test() {
        String result = myFeignClient.test(234L);
        System.out.println(result);
        return result;
    }

    @GetMapping("/test2")
    public String test2() {
        TestParam testParam = new TestParam(55, "zhangsan");
        String result = myFeignClient.post(testParam);
        System.out.println(result);
        return result;
    }

    @RequestMapping(value = "/sys/user" ,method = RequestMethod.GET)
    public String getUsers() {
      return   myFeignClient.getUsers();
    }



}
