package com.bolsadeideas.springboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping(value="/tem")
	public String tem() {
		return "tem";
	}
	
	@RequestMapping(value="/ver")
	public String ver() {
		return "ver";
	}
	
	@RequestMapping(value="/factura")
	public String admin() {
		return "factura";
	}
	
}
