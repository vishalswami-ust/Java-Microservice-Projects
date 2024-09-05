package com.iiht.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")
public class Controller {
	
	@GetMapping("/default")
	public String confirm() {
		return "Connected _____ Responding";
	}

}
