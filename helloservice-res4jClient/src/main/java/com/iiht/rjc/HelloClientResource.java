package com.iiht.rjc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/api")
public class HelloClientResource {
	@Autowired
	RestTemplate temp;
	
	public final static String CLIENT_SERVICE="clientService";
	
	@GetMapping
	@CircuitBreaker(name=CLIENT_SERVICE, fallbackMethod="callOnFail")
	public String callServer() {
		String url = "http://localhost:8071/rest/service/default";
		String ans = temp.getForObject(url, String.class);
		return ans;
	}
	
	public String callOnFail(Exception e) {
		return "Dikkat Hai";
	}
}
