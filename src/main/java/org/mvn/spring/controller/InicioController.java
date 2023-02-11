package org.mvn.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicioController {
	
	@RequestMapping("/")
	public String showInicio() {
		
		return "inicio";
	}
	
	@GetMapping("/formLogin")
	public String showLoginPropio() {
		
		return "login-propio";
	}
}
