package com.example.mapStrcutBasic.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.example.mapStrcutBasic.DTO.OrderDTO;
import com.example.mapStrcutBasic.Entity.Order;

@Mapper(componentModel = "spring")
public interface OrderMapper {

	@Mappings({
		@Mapping(source = "orderAmount" , target = "amount"),
		@Mapping(source = "orderDate" , target = "date" , dateFormat = "yyyy-MMM-dd")
	})
	Order toEntity(OrderDTO orderDTO);
	
	@Mappings({
		@Mapping(target = "orderAmount" , source = "amount"),
		@Mapping(target = "orderDate" , source = "date" , dateFormat = "yyyy-MMM-dd")
	})	
	OrderDTO toDTO(Order order);
	
	
}
