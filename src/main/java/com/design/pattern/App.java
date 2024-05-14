package com.design.pattern;

import java.util.List;

import com.design.pattern.model.Employe;
import com.design.pattern.model.EmployeClient;

public class App 
{
    public static void main( String[] args )
    {
        //But: utiliser design pattern adapter (type structural) pour renvoyer un employeClient au lieu d'un employe
        EmployeClient client = new EmployeClient();
		
		List<Employe> employees = client.getEmployeeList();
		
		System.out.println(employees);
    }
}
