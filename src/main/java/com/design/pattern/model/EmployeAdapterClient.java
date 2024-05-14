package com.design.pattern.model;

public class EmployeAdapterClient implements Employe {

    private final EmployeDatabaseB employeToSend;
    
    public EmployeAdapterClient(EmployeDatabaseB employeToSend) {
        this.employeToSend = employeToSend;
    }

    @Override
    public String getId() {
        return employeToSend.getCn(); 
    }

    @Override
    public String getFirstName() {
        return employeToSend.getGivenName(); 
    }

    @Override
    public String getLastName() {
        return employeToSend.getSurname(); 
    }

    @Override
    public String getEmail() {
        return employeToSend.getMail(); 
    }

	public String toString() {
		return "ID: " + getId() + ", First name: " + getFirstName() + ", Last name: " + getLastName() + ", Email: " + getEmail();
	}

}
