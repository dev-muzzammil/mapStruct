package com.example.mapStrcutBasic.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapStrcutBasic.DTO.EmployeeDTO;
import com.example.mapStrcutBasic.DTO.EmployeeDetailsDTO;
import com.example.mapStrcutBasic.Entity.Employee;
import com.example.mapStrcutBasic.Service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

	private final EmployeeService employeeService;
	
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
		return ResponseEntity.ok(employeeService.saveEmployee(employeeDTO));
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable Long id) {
		return ResponseEntity.ok(employeeService.getEmployeeById(id));
	}
	
	
	@GetMapping("/details/{id}")
	public ResponseEntity<EmployeeDetailsDTO> getEmployeeDetailsById(@PathVariable Long id) {
		return ResponseEntity.ok(employeeService.getEmployeeDetailsById(id));
	}
	
	
}
