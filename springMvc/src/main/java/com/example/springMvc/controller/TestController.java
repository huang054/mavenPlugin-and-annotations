package com.example.springMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
	@Autowired
	private TestService service;
	
	@RequestMapping("/hello")
	@AnnTest
	public String test() {
		return "hello";
	}

	@RequestMapping("/hello1")
	@AnnTest
	public String test1() {
   List<String> strs = new ArrayList<>();
		return service.hello();
	}

}
