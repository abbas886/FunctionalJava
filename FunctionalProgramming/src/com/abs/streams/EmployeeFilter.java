package com.abs.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.abs.lamda.Employee;

public class EmployeeFilter {
	
	public static  List<Employee> getEmployees()
	{
		List<Employee> EmployeeList = new ArrayList<>();
		Employee emp;
		emp=new Employee(101, "Abbas", 10000,30);
		EmployeeList.add(emp);
		emp=new Employee(102, "SP", 00000,72);
		EmployeeList.add(emp);
		emp=new Employee(103, "Som", 20000,73);
		EmployeeList.add(emp);
		emp=new Employee(104, "Rakesh", 40000,32);
		EmployeeList.add(emp);
		emp=new Employee(105, "Harsh", 50000,28);
		EmployeeList.add(emp);
		return EmployeeList;
	}
	
	
	
	public static void main(String[] args) {
		
		List<Employee> employees =getEmployees();
		
		employees.stream()
        .filter((p) -> (p.getSalary() > 1400))
        .forEach((p) -> System.out.printf("%s %s; ", p.getId(), p.getName()));
		
		/////////////////////////////////////////////////////////////////////////
		Predicate<Employee> ageFilter = (p) -> (p.getAge() > 25);
		Predicate<Employee> salaryFilter = (p) -> (p.getSalary() > 1400);
		//Predicate<Person> genderFilter = (p) -> ("female".equals(p.getGender()));
		 
		employees.stream()
		          .filter(ageFilter)
		          .filter(salaryFilter)
		          //.filter(genderFilter)
		          .forEach((p) -> System.out.printf("%s %s; ", p.getId(), p.getSalary()));

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
