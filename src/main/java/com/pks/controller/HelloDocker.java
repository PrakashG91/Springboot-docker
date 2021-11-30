package com.pks.controller;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDocker {
	
	@RequestMapping(method = RequestMethod.GET,value = "/hello")
	public String hello() {
		return "hello, Welcome to docker project";
	}

}
