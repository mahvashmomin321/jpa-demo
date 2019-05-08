package com.capgemini.inheritanceperConcrete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inheritanceperConcrete.dao.EmployeeDao;
import com.capgemini.inheritanceperConcrete.enities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	private EmployeeDao dao;
	
	@Override
	public Employee addNew(Employee employee) {
		return dao.save(employee);
	}

}
