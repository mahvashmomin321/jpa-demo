package com.capgemini.inheritanceperConcrete.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.inheritanceperConcrete.enities.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
