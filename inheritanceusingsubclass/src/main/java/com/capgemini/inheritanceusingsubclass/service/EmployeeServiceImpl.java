package com.capgemini.inheritanceusingsubclass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inheritanceusingsubclass.dao.EmployeeDao;
import com.capgemini.inheritanceusingsubclass.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	@Override
	public Employee addNew(Employee employee) {
		
		return dao.save(employee);
	}

}
