package com.infotech.client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.infotech.model.Employee;

public class ClientTest {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Davis", 30));
		empList.add(new Employee("Martin", 40));
		empList.add(new Employee(null, 40));
		empList.add(new Employee("Alice", 23));
		empList.add(new Employee("Martin", 25));
		empList.add(new Employee("Barry", 34));
		empList.add(new Employee(null, 34));
		empList.add(new Employee("Martin", 35));
		empList.add(new Employee(null, 34));
		empList.add(new Employee("James", 45));
		
		//Comparator<Employee> comp = Comparator.comparing(Employee::getName, Comparator.nullsFirst(String::compareTo));
		Comparator<Employee> comp = Comparator.comparing(Employee::getName, Comparator.nullsLast(String::compareTo));
		empList.sort(comp);
		empList.forEach(System.out::println);
		
	}

}
