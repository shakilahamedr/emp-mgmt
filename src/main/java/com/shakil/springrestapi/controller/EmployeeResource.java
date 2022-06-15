package com.shakil.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shakil.springrestapi.model.Employee;
import com.shakil.springrestapi.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/employees")
public class EmployeeResource {

		@Autowired
		private EmployeeService employeeService;
		
		@GetMapping
		public List<Employee> getEmployees() {
			return employeeService.getEmployees();
		}
		
		@GetMapping("/hi")
		public String getTest() {
			return "hishakil";
		}
		
		@GetMapping("/{id}")
		public Employee getEmployeeById(@PathVariable int id) {
			return employeeService.getEmployeeById(id);
		}
		
		@PutMapping("/{id}")
		public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
			return employeeService.updateEmployee(id, employee);
		}
		
		@PostMapping
		public Employee addEmployee(@RequestBody Employee employee) {
			return employeeService.addEmployee(employee);
		}
		
		@DeleteMapping("/{id}")
		public Employee deleteEmployee(@PathVariable int id) {
			return employeeService.deleteEmployee(id);
		}
}
//create table Employee(id integer primary key, name varchar(30), gender varchar(10), age integer, salary integer ); 
