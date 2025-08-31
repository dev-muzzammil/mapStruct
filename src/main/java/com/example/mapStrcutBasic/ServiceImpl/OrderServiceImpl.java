package com.example.mapStrcutBasic.ServiceImpl;

import org.springframework.stereotype.Service;

import com.example.mapStrcutBasic.DTO.OrderDTO;
import com.example.mapStrcutBasic.Entity.Order;
import com.example.mapStrcutBasic.Mapper.OrderMapper;
import com.example.mapStrcutBasic.Repo.OrderRepo;
import com.example.mapStrcutBasic.Service.OrderService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

	private final OrderRepo orderRepo;
	
	private final OrderMapper orderMapper;
	
	
	@Override
	public Order saveOrder(OrderDTO orderDTO) {
		return orderRepo.save(orderMapper.toEntity(orderDTO));
	}
	
	
	@Override
	public OrderDTO getOrderById(Long id) {
		return orderRepo.findById(id)
				.map(orderMapper::toDTO)
				.orElse(new OrderDTO());
	}
	
}
