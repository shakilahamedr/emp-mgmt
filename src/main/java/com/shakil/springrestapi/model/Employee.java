package com.shakil.springrestapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	private int id;
	private String name;
	private String gender;
	private int age;
	private double salary;	
	
}
