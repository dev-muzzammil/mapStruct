package com.example.mapStrcutBasic.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.example.mapStrcutBasic.DTO.EmployeeDetailsDTO;
import com.example.mapStrcutBasic.Entity.Department;
import com.example.mapStrcutBasic.Entity.Employee;

@Mapper(componentModel = "spring")
public interface EmployeeDetailsMapper {

	@Mappings({
		@Mapping(source = "employee.name" , target = "empName"),
		@Mapping(source = "employee.id" , target = "empId"),
		@Mapping(source = "department.deptName" , target = "deptName"),
		@Mapping(source = "department.id" , target = "deptId")
	})
	EmployeeDetailsDTO toEmployeeDetailsDTO(Employee employee, Department department);
	
	
}
