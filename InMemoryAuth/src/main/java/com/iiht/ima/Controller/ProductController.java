package com.iiht.ima.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class ProductController {
	
	@GetMapping()
		public String some() {
			return "Hello";
		}
	
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/admin")
	public String getProduct() {
		return "admin logged in successfully";
	}
	
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/user")
	public String getRole() {
		return "Users";
	}
}
