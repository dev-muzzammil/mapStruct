package com.example.mapStrcutBasic.ServiceImpl;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import com.example.mapStrcutBasic.DTO.EmployeeDTO;
import com.example.mapStrcutBasic.DTO.EmployeeDetailsDTO;
import com.example.mapStrcutBasic.Entity.Employee;
import com.example.mapStrcutBasic.Mapper.DepartmentMapper;
import com.example.mapStrcutBasic.Mapper.EmployeeDetailsMapper;
import com.example.mapStrcutBasic.Mapper.EmployeeMapper;
import com.example.mapStrcutBasic.Repo.EmployeeRepo;
import com.example.mapStrcutBasic.Service.EmployeeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
	
	private final EmployeeRepo employeeRepo;
	
	private final EmployeeMapper employeeMapper;
	
	private final EmployeeDetailsMapper employeeDetailsMapper;
	
	private final DepartmentMapper departmentMapper;
	
	
	@Override
	public Employee saveEmployee(EmployeeDTO employeeDTO) {
		return employeeRepo.save(employeeMapper.toEntity(employeeDTO));
	}
	
	
	@Override
	public EmployeeDTO getEmployeeById(Long id) {
		return employeeRepo.findById(id)
				.map(employeeMapper::toDTO)
				.orElse(new EmployeeDTO());
	} 
	
	
	@Override
	public EmployeeDetailsDTO getEmployeeDetailsById(Long id) {
		return employeeRepo.findById(id)
				.map(employee -> {
					return employeeDetailsMapper.toEmployeeDetailsDTO(employee, employee.getDepartment());
				}).orElse(new EmployeeDetailsDTO());
	}
	
	
}
