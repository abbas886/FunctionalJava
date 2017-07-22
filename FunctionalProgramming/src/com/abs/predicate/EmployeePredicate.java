package com.abs.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.abs.lamda.Employee;

public class EmployeePredicate {
	
	public static Predicate<Employee> isSalaryMoreThanAndAgeLessThan() {
        return p -> p.getAge() < 40 && p.getSalary()>50000;
    }
     
      
    public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }
     
    public static List<Employee> filterEmployees (List<Employee> employees, Predicate<Employee> predicate) {
        return employees.stream().filter( predicate ).collect(Collectors.<Employee>toList());
    }

}
