package com.crud.springboot.thymeleafdemo.service;

import java.util.List;

import org.apache.catalina.authenticator.SavedRequest;

import com.crud.springboot.thymeleafdemo.entity.Employee;



public interface EmployeeService {
	
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

}
