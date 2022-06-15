package com.shakil.springrestapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shakil.springrestapi.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {

}
