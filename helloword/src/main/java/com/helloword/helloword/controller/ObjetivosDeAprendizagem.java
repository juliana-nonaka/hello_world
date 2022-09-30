package com.helloword.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivos")
public class ObjetivosDeAprendizagem {
	
	@GetMapping
	public String ObjetivoDeAprendizagem () {
		return "Objetivos: <br> "
				+ "Melhoraia no Currículo,"
				+ "Melhoria na Gestão de Tempo<br>";
				
		
	}

}
