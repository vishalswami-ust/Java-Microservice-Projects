package com.iiht.ima.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.ima.model.Product;

@Repository
public interface ProductRepos extends JpaRepository<Product, Long> {

}
