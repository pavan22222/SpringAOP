package com.vrnda.beans;

import java.util.List;

public class EmployeeService {
		public List<String> getEmployees(String user){
			System.out.println("EmployeeService.getEmployees()");
			return List.of("Pavan","Naveen","Srikanth");
		}
}
