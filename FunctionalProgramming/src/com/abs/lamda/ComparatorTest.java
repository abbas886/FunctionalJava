package com.abs.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
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
		   
		     List<Employee> employeeList = getEmployees();
		   
		     // Sort with Inner Class
		     Collections.sort(employeeList, new Comparator<Employee>(){
		       public int compare(Employee p1, Employee p2){
		         return p1.getName().compareTo(p2.getName());
		       }
		     });
		     
		     System.out.println("=== Sorted Asc Name ===");
		      for(Employee p:employeeList){
			      System.out.println(p.getName());
			     }
		     
		     // Use Lambda instead
		     
		     // Print Asc
		     System.out.println("=== Sorted Asc Name ===");
		     
		    // Collections.sort(employeeList, (Employee p1, Employee p2) -> p1.getName().compareTo(p2.getName()));
		     
		     Collections.sort(employeeList, (p1,  p2) -> p1.getName().compareTo(p2.getName()));
		 
		     for(Employee p:employeeList){
		      System.out.println(p.getName());
		     }
		     
		     // Print Desc
		     System.out.println("=== Sorted Desc Name ===");
		     Collections.sort(employeeList, (p1,  p2) -> p2.getName().compareTo(p1.getName()));
		 
		     for(Employee p:employeeList){
		    	 System.out.println(p.getName());
		     }
		     
		     
		     
		 
		     
		     
		     
		     
		     
		   }
		 }


