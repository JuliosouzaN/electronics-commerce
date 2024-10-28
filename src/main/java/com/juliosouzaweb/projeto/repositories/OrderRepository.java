package com.juliosouzaweb.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliosouzaweb.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
