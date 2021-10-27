package com.helloworld02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class HelloWorld02Controller {
	
	@GetMapping
	public String hello2() {
		return "Os objetivos de aprendizagem para essa semana é continuar no foco da aprendizagem do SpringBoot!!!";
		
		
	}

}
