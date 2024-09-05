package com.iiht.pfs.service;

import java.util.List;

import com.iiht.pfs.resource.Product;

public interface ProductService {
	List<Product> findAll();

	List<Product> findByCategory(String category);

	Product findById(int id);
}
