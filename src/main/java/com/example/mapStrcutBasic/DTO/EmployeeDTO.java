package com.example.mapStrcutBasic.DTO;

import lombok.Data;

@Data
public class EmployeeDTO {

	private Long empId;
	private String empName;
	private String email;
	private double salary;
//	private String departmentName;
	private DepartmentDTO departmentDTO;
	
	
}
