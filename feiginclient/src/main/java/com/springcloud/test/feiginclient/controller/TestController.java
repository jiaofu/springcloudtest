package com.springcloud.test.feiginclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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
