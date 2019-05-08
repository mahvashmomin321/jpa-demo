package com.capgemini.inheritanceusingsubclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inheritanceusingsubclass.entities.ContractEmployee;
import com.capgemini.inheritanceusingsubclass.entities.Employee;
import com.capgemini.inheritanceusingsubclass.entities.RegularEmployee;
import com.capgemini.inheritanceusingsubclass.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping("/add")
	public Employee addNewEmployee() {
		RegularEmployee e1= new RegularEmployee(104, "Mahi", 24000, 2000);
		service.addNew(e1);
		ContractEmployee e2= new ContractEmployee(105, "Akshata", 2000, "20hrs");
		service.addNew(e2);
		return e2;
		
	}
}
