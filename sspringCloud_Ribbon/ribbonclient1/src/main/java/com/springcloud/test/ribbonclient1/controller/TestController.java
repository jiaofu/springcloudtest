package com.springcloud.test.ribbonclient1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class TestController {

	@Value("${server.port}")
	String port;

	@GetMapping("/{id}")
	public String getMessage(@PathVariable Long id) {
		return "the request1 id is " + id + " server:"+port;
	}
	@PostMapping("/post")
	public String post(@RequestBody TestParam testParam) {
		return "testParam 1" + testParam.toString();
	}

	@RequestMapping(value = "/sys/user" )
	public String getUsers() {
		System.out.println("调用成功！");
		return "调用成功！"+ " server:"+port;
	}
	
}
