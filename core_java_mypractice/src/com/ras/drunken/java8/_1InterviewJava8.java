package com.ras.drunken.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * 
 * convert List of employee to map and the output key should be the city name and value should be
	List<Employee> who resides in that city/
 */


public class _1InterviewJava8 {
public static void main(String[] args) {
	
	List<Employee> empList = new ArrayList<>();
	createEmployeeList(empList);
	
	Map<String, List<Employee>> empMap = empList.stream().collect(Collectors.groupingBy(Employee :: getCity));
	empMap.forEach((key,value)-> System.out.println("City :"+ key +value));
//	empList.stream().collect(Collectors.groupingBy(Employee :: getId));
}

	public static void createEmployeeList(List<Employee> empList) {
		Employee e1 = new Employee();
		e1.setName("Arun");
		e1.setCity("Hyderabad");
		e1.setId(1);
		
		Employee e2 = new Employee();
		e2.setName("Mahesh");
		e2.setCity("Noida");
		e2.setId(2);
		
		Employee e3 = new Employee();
		e3.setName("Vijay");
		e3.setCity("Pune");
		e3.setId(3);
		
		Employee e4 = new Employee();
		e4.setName("Laxman");
		e4.setCity("Bangalore");
		e4.setId(4);
		
		Employee e5 = new Employee();
		e5.setName("Kalyan");
		e5.setCity("Bangalore");
		e5.setId(5);
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
	}
}


class Employee{
	
	private String name;
	private int id;
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	
}
