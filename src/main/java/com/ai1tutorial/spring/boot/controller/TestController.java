package com.ai1tutorial.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@RequestMapping("/test")
    public String test(){
    	return "Ajays' AWS App Running Successfully";
    }
}
