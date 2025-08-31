package com.example.mapStrcutBasic.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapStrcutBasic.Entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

	
}
