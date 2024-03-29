package com.springtemplate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springtemplate.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
