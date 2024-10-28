package com.juliosouzaweb.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliosouzaweb.projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
