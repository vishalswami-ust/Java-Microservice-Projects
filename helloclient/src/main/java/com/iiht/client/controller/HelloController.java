package com.iiht.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
@RequestMapping("/rest/client1")
public class HelloController {
	
	@Autowired
	RestTemplate temp;
	
	@GetMapping
	public ResponseEntity<String> connect() {
		String url = "http://localhost:8073/rest/service1";
		ResponseEntity<String> res = temp.getForEntity(url, String.class);
		return res;
	}
	
	

	@GetMapping("/fact/{num}")
	public ResponseEntity<Integer> connect1(@PathVariable int num) {
		String url = "http://localhost:8073/rest/service1/fact/" + num;
		ResponseEntity<Integer> res = temp.getForEntity(url, Integer.class);
		return res;
	}
}
