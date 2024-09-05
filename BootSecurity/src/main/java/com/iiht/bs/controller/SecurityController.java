package com.iiht.bs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.bs.model.Product;
import com.iiht.bs.service.ProductService;

@RestController
@RequestMapping("/product/api")
public class SecurityController {
	@Autowired
	ProductService ps;
	
	@PreAuthorize("hasRole('ADMIN')")
	 @GetMapping("/allProducts")
	 public List<Product> getAll() {
		  return ps.findAll();
	 }

	 @GetMapping("/products-by-id/{id}")
		public Product getProductById(@PathVariable ("id") int id) {
		   System.out.println(id);
		   return ps.findById(id);
	 }

	 @GetMapping("/products-by-category/{category}")
		public List<Product> getProductsByCategory(@PathVariable("category") String category){
		           return ps.findByCategory(category);
	 }
}
