package com.abs.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.abs.lamda.Employee;

public class EmployeePredicateTest {
	
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
	
	public static Predicate<Employee> isSalaryMoreThanAndAgeLessThan() {
        return p -> p.getAge() < 40 && p.getSalary()>50000;
    }
     
      
    public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }
     
    public static List<Employee> filterEmployees (List<Employee> employees, Predicate<Employee> predicate) {
        return employees.stream().filter( predicate ).collect(Collectors.<Employee>toList());
    }

	
	public static void main(String[] args) {
		List<Employee>  employees =getEmployees();
		
		  System.out.println(filterEmployees(employees, isAgeMoreThan(50)));
	         
	        System.out.println(filterEmployees(employees, isSalaryMoreThanAndAgeLessThan()));
	         
	         System.out.println(filterEmployees(employees, isAgeMoreThan(35).negate()));
	}

}
