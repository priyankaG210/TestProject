package com.priyanka.spring.springjdbc.employee.dao;

import java.util.List;

import com.priyanka.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDao {
	int create(Employee employee);
	
	int update(Employee employee);
	
	int delete(Employee employee);
	
	Employee read(int id);
	
	List<Employee> read();

}
