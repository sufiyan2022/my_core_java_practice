package com.ras.drunken.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class _10WiproJava8CodingQuestion {
public static void main(String[] args) {
	
	List<Employee4> empList = new ArrayList<>();
	createEmployeeList(empList);
	
//	Program to print Max/min employee salary from the given collection
	System.out.println("=====max salary======");
	Optional<Employee4> highestEmp = empList.stream().
			collect(Collectors.maxBy(Comparator.comparingDouble(Employee4::getSalary)));
	System.out.println(highestEmp);
//	or
	Optional<Employee4> max = empList.stream().max(Comparator.comparingDouble(Employee4 :: getSalary));
	System.out.println("======Max2======"+max);
	
	System.out.println("=====min salary======");
	Optional<Employee4> minSalary = empList.stream()
			.collect(Collectors.minBy(Comparator.comparingDouble(Employee4::getSalary)));
	System.out.println(minSalary);
	
//	program to print max salary of an employee from each department
	System.out.println("============max salary by department===========");
	 Map<String, Optional<Employee4>> empwithhighestSalByDept = empList.stream().collect(Collectors
			.groupingBy(Employee4::getDepartment,Collectors
						.reducing(BinaryOperator.maxBy( Comparator.comparing(Employee4::getSalary)))));
	 empwithhighestSalByDept.forEach((key,value)-> System.out.println(key+"-"+value));
	 
//	program to print active and inactive employee in the given collection.
	System.out.println("========active and inactive employee given collection=============");
	 Map<String, Long> activeInactiveCount = empList.stream()
			 .collect(Collectors.groupingBy(Employee4::getActive,Collectors.counting()));
	 activeInactiveCount.forEach((key,value)-> System.out.println(key+"-"+value));
	 
//	program to print employee details working with each department.
	System.out.println("========employee details in each department=============");
	Map<String, List<Employee4>> empDept = empList.stream()
			 .collect(Collectors.groupingBy(Employee4::getDepartment));
	empDept.forEach((key,value)-> System.out.println(key+"-"+value));
	
//	program to print employee count working in each department
	System.out.println("========employee count working in each department=============");
	Map<String, Long> empDeptCount = empList.stream()
			 .collect(Collectors.groupingBy(Employee4::getDepartment,Collectors.counting()));
	empDeptCount.forEach((key,value)-> System.out.println(key+"-"+value));
}
private static void createEmployeeList(List<Employee4> empList) {
	empList.add(new Employee4(111, "Naveen", 32, "No", "HR", 2011, 25000.0));
	empList.add(new Employee4(122, "Bobby", 25, "Yes", "Sales and Marketing", 2015, 13500.0));
	empList.add(new Employee4(133,"Lucky", 29, "Yes", "Infrastructure", 2012, 18000.0));
	empList.add(new Employee4(144, "Jeet", 28, "Yes","Product Development" , 2014, 32500));
	empList.add(new Employee4(155, "Riya", 27, "No", "HR", 2012, 22700.0));
	empList.add(new Employee4(166, "Niraj", 43, "Yes", "Security and Transport", 2016, 10500.0));
	empList.add(new Employee4(177, "Abishek", 35, "Yes", "Account and Finance", 2010, 27000.0));
	empList.add(new Employee4(188, "Roop", 31, "Yes", "Product Development", 2015, 34500.0));
	empList.add(new Employee4(199, "Amit", 24, "No", "Sales and Marketing", 2016, 11500.0));
	empList.add(new Employee4(200, "Pramod", 38, "Yes", "Security and Transport", 2015, 11000.5));
	empList.add(new Employee4(211, "Mohit", 27, "No", "Infrastructure", 2014, 15700.0));
	empList.add(new Employee4(222, "Nithin Joshi", 25, "Yes", "Product Development", 2016, 28200.0));
	empList.add(new Employee4(233, "Jyothi Reddy", 27, "No", "Account and Finance", 2013, 21300.0));
	empList.add(new Employee4(244, "Nithin", 24, "Yes", "Sales and Marketing", 2017, 10700.0));
	empList.add(new Employee4(255, "Anmol", 23, "Yes", "Infrastructure", 2018, 12700.0));
	empList.add(new Employee4(266, "Sanvi Pandey", 26, "No", "Product Development", 2015, 28900.0));
	empList.add(new Employee4(277, "Anuj Chettiar", 31, "Yes", "Product Development", 2012, 35700.0));
	
}
}

class Employee4 {

	private int id;
	private String name;
	private int age;
	private String active;
	private String department;
	private int yearOfJoining;
	private double salary;

	public Employee4(int id, String name, int age, String active, String department, int yearOfJoining,
			double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.active = active;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", active=" + active + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

	

}