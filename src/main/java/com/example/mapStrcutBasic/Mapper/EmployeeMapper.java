package com.example.mapStrcutBasic.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.example.mapStrcutBasic.DTO.EmployeeDTO;
import com.example.mapStrcutBasic.Entity.Employee;

@Mapper(componentModel = "spring" , uses = {DepartmentMapper.class})
public interface EmployeeMapper {
	
	
	@Mappings({
		@Mapping(source = "empName" , target = "name"),
		@Mapping(source = "empId" , target = "id"),
//		@Mapping(source = "departmentName" , target = "department.deptName")
		@Mapping(source = "departmentDTO" , target = "department")
	})
	Employee toEntity(EmployeeDTO employeeDTO);

	@Mappings({
		@Mapping(source = "name" , target = "empName"),
		@Mapping(source = "id" , target = "empId"),
//		@Mapping(source = "department.deptName" , target = "departmentName")
		@Mapping(source = "department" , target = "departmentDTO")
	})
	EmployeeDTO toDTO(Employee employee);
	
}
