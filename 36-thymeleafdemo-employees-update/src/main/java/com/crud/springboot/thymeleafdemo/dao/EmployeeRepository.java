package com.crud.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.springboot.thymeleafdemo.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {//the Integer is primary key
	
	//that's it .... no need to write any code  LOL !
	
	
	//add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();
	//public List<Employee> findAllByOrderByFirstNameAsc();

}
