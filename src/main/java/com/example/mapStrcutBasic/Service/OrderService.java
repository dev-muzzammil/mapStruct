package com.example.mapStrcutBasic.Service;

import com.example.mapStrcutBasic.DTO.OrderDTO;
import com.example.mapStrcutBasic.Entity.Order;

public interface OrderService {

	Order saveOrder(OrderDTO orderDTO);
	
	OrderDTO getOrderById(Long id);
	
}
