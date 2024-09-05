package com.iiht.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service1")
public class Controller {
	
	@GetMapping
	public String confirm() {
		return "Connected _____ Responding";
	}
	
	@GetMapping("/fact/{num}")
	public int fact(@PathVariable int num) {
		int ans=1;
		while(num>1) {
			ans = ans*num;
			num-=1;
		}
		return ans;
	}

}
