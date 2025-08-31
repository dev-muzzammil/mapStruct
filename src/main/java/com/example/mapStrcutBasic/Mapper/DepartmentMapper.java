package com.example.mapStrcutBasic.Mapper;

import org.mapstruct.Mapper;

import com.example.mapStrcutBasic.DTO.DepartmentDTO;
import com.example.mapStrcutBasic.Entity.Department;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

	Department toEntity(DepartmentDTO departmentDTO);
	
	DepartmentDTO toDTO(Department department);
	
}
