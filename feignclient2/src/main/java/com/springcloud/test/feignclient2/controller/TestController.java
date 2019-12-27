package com.springcloud.test.feignclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Value;

@RestController
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
	
}
