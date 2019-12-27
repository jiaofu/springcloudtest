package com.springcloud.test.feignweb.server;


import com.springcloud.test.feignweb.dto.TestParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@FeignClient(value = "eureka-server")
public interface IMyFeignClient {
    @RequestMapping(value = "/v1/{id}",method = RequestMethod.GET)
    public String test(@PathVariable("id") Long id);

    @RequestMapping(value = "/v1/post",method = RequestMethod.POST)
    public String post(@RequestBody TestParam testParam);


    @RequestMapping(value="/v1/sys/user", method=RequestMethod.GET)
    public String getUsers();
}
