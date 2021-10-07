package com.App.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import com.App.models.Employee;
import com.App.repositories.EmployeeRepository;
import com.App.repositories.UserRepository;



@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
		
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	// Save new country
	
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public Optional<Employee> findById(int id){
		return employeeRepository.findById(id);
	}
	
	public void delete(int id) {
		employeeRepository.deleteById(id);
	}
	
		
	public Employee findByUsername(String un){
		return employeeRepository.findByUsername(un);
	}
	
	

}
