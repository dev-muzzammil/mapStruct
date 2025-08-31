package com.example.mapStrcutBasic.Service;

import com.example.mapStrcutBasic.DTO.EmployeeDTO;
import com.example.mapStrcutBasic.DTO.EmployeeDetailsDTO;
import com.example.mapStrcutBasic.Entity.Employee;

public interface EmployeeService {

	
	Employee saveEmployee(EmployeeDTO employeeDTO);
	
	EmployeeDTO getEmployeeById(Long id);

	EmployeeDetailsDTO getEmployeeDetailsById(Long id);
	
	
}

