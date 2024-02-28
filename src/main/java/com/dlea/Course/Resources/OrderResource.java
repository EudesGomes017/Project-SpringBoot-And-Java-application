package com.dlea.Course.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dlea.Course.entities.Order;
import com.dlea.Course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderService OrderService;

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {

		List<Order> list = OrderService.finAll();

		return ResponseEntity.ok().body(list);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findAllById( @PathVariable Long id) {

		Order obj = OrderService.findById(id);

		return ResponseEntity.ok().body(obj);

	}

}
