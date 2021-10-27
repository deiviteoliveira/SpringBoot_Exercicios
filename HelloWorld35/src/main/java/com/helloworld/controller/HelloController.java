package com.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		
		return "Hello Generation!! Nessa atividade utilizei a Mentalidade de Crescimento  acreditando que a inteligência aumenta com o trabalho arduo, seguida da habilidade de Persistência";
				
		
	}

}
