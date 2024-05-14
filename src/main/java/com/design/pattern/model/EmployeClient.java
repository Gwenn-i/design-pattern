package com.design.pattern.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeClient {



	public List<Employe> getEmployeeList() {
	
		List<Employe> employees = new ArrayList<>();
		
		Employe employeFromDatabaseA = new EmployeDatabaseA("1234", "John", "Wick", "john@wick.com");
		employees.add(employeFromDatabaseA);
		
		EmployeDatabaseB employeToSend = new EmployeDatabaseB("chewie", "Solo", "Han", "han@solo.com");
		employees.add(new EmployeAdapterClient(employeToSend));
	
		return employees;
		
	}
	
}