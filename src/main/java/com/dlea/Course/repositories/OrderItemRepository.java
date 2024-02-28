package com.dlea.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dlea.Course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	
}
