package com.dlea.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dlea.Course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
