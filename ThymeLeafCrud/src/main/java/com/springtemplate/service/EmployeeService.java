package com.springtemplate.service;

import java.util.List;

import com.springtemplate.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployee();

	void save(Employee employee);

	Employee getById(Long id);

	void deleteViaId(long id);
}
