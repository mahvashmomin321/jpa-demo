package com.capgemini.inheritanceperConcrete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inheritanceperConcrete.enities.Employee;
import com.capgemini.inheritanceperConcrete.enities.RegularEmployee;
import com.capgemini.inheritanceperConcrete.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/add")
	public Employee addEmployee() {
		RegularEmployee e1= new RegularEmployee(101, "Mahi", 24000, 2000);
		service.addNew(e1);
		return e1;
	}
	
}
