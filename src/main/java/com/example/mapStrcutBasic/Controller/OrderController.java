package com.example.mapStrcutBasic.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapStrcutBasic.DTO.OrderDTO;
import com.example.mapStrcutBasic.Entity.Order;
import com.example.mapStrcutBasic.Service.OrderService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

	private final OrderService orderService;
	
	@PostMapping
	public ResponseEntity<Order> saveOrder(@RequestBody OrderDTO orderDTO) {
		return ResponseEntity.ok(orderService.saveOrder(orderDTO));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<OrderDTO> getOrderById(@PathVariable Long id) {
		return ResponseEntity.ok(orderService.getOrderById(id));
	}
	
	
}
