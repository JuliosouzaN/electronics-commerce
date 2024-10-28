package com.juliosouzaweb.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliosouzaweb.projeto.entities.OrderItem;
import com.juliosouzaweb.projeto.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{
	
}
