package com.springtemplate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtemplate.dao.EmployeeDao;
import com.springtemplate.model.Employee;

@Service
public class EmployeeSeviceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public List<Employee> getAllEmployee() {
		return employeeDao.findAll();
	}

	@Override
	public void save(Employee employee) {
		employeeDao.save(employee);
	}

	@Override
	public Employee getById(Long id) {
		Optional <Employee> optional = employeeDao.findById(id); 
		Employee employee=null;
		if(optional.isPresent()) {
			employee = optional.get();
		}else {
			throw new RuntimeException("Employee not found for id :" + id);
		}
		return employee;
	}

	@Override
	public void deleteViaId(long id) {
		employeeDao.deleteById(id);
	}

}
