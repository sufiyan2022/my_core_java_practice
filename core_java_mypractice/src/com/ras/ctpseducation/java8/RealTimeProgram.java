package com.ras.ctpseducation.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RealTimeProgram {
	public static void main(String[] args) {

		List<Employee> employeeList = Arrays.asList(new Employee("101", "Siva", 35, "Sales", 30000),
				new Employee("102", "Bala", 42, "HR", 42000), new Employee("103", "Ramesh", 23, "Development", 20000),
				new Employee("104", "Devi", 54, "Sales", 48000),
				new Employee("105", "Ramya", 25, "Development", 22000));

//		printEmployees(employeeList);
//		checkSalary(employeeList);
//		printEmploeeNames(employeeList);
//		highestSalaryEmployee(employeeList);
//		minimumSalaryEmployee(employeeList);
		
//		removeDuplicateDepartment(employeeList);
//		printNumberOfEmployees(employeeList);
//		sortEmployees(employeeList);
//		sortEmployeesReverse(employeeList);
//		sortEmployeesTwo(employeeList);
		printDuplicateDepartments(employeeList);
	}



//print the employees list using stream
	
	public static void printEmployees(List<Employee> empList) {
		System.out.println("printing the employee list using stream");
//		empList.stream().forEach(emp -> System.out.println(emp));
		empList.stream().forEach(System.out::println);
	}
	
//	find the employees whose salary greater than 40000
	static void checkSalary(List<Employee> empList) {
		System.out.println("the employees whose salary greater than 40000");
//		filter the result based on condition
		empList.stream()
			.filter(emp-> emp.getSalary() > 40000)
			.forEach(System.out::println);
	}
	
//	print the name of employees in Sales Department
	private static void printEmploeeNames(List<Employee> employeeList) {
		System.out.println("the name of employees in Sales Department");
//		Employee(Object) -> name(String)
//		map() : converts one object to another
		employeeList.stream()
			.filter(emp -> emp.getDepartment().equals("Sales"))
			.map(emp -> emp.getName())
			.forEach(emp -> System.out.println(emp));
		
//		employeeList.stream().filter(emp -> emp.getDepartment().equals("Sales"))
//			.map(Employee::getName)
//			.forEach(System.out::println);
	}
	
//	print the name of the highest salary employee
	private static void highestSalaryEmployee(List<Employee> employeeList) {
		System.out.println("the name of the highest salary employee");
		String maxSalaryEmp = employeeList.stream()
			.max(Comparator.comparing(Employee::getSalary))
				.map(Employee::getName)
				.get();
		
		System.out.println("Max Salary Employee: "+ maxSalaryEmp);
	}
	
//	print the name of Minimum Salary employee
	private static void minimumSalaryEmployee(List<Employee> employeeList) {
		System.out.println("the name of Minimum Salary employee");
		String minSalaryEmp = employeeList.stream().min(Comparator.comparing(Employee::getSalary))
				.map(Employee::getName).get();
		System.out.println("Minimum Salary emp:" + minSalaryEmp);
		
	}
	
//	Remove the duplicate department/ print the unique department
//	Expected output - Sales, HR, Development
	private static void removeDuplicateDepartment1(List<Employee> employeeList) {
		System.out.println("The Unique Department are: ");
			employeeList.stream()
			.map(Employee::getDepartment)
			.distinct()
			.forEach(System.out::println);
	}
	
//	collect() - to collect the elements to collection
	private static void removeDuplicateDepartment(List<Employee> employeeList) {
		System.out.println("The Unique Department are: ");
		String uniqueDepartment = employeeList.stream()
			.map(Employee::getDepartment)
			.distinct()
			.collect(Collectors.joining(","));
		System.out.println(uniqueDepartment);
	}
	
//	sort the employees based on name
	private static void sortEmployees(List<Employee> employeeList) {
		System.out.println("Sorting the employees based on names.");
		employeeList.stream().map(Employee::getName)
			.sorted()
			.forEach(System.out::println);
		
	}
	
//	sort the employees based on name in reverse order
//	reverseOrder(): sort the stream in decending order
	private static void sortEmployeesReverse(List<Employee> employeeList) {
		System.out.println("Sorting the employee based on names decending order.");
		employeeList.stream()
			.map(Employee::getName)
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
	}
	
//	sort the employee based on department and name
	private static void sortEmployeesTwo(List<Employee> employeeList) {
		System.out.println("sorting the employee based on department and name");
		employeeList.stream()
			.sorted(Comparator.comparing(Employee::getDepartment)
					.thenComparing(Employee::getName)).forEach(System.out::println);
	}
	
//	print the no of employees in each department
	private static void printNumberOfEmployees(List<Employee> employeeList) {
		System.out.println("print the no of employees in each department");
//		Map<String, List<Employee>> noOfEmps = employeeList.stream()
//			.collect(Collectors.groupingBy(Employee::getDepartment));
//		System.out.println(noOfEmps);
		
		Map<String, Long> noOfEmps = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
			System.out.println(noOfEmps);
		
	}
	
//	print the duplicate department- expected output: Sales, Development
	private static void printDuplicateDepartments(List<Employee> employeeList) {
		System.out.println("print the duplicate department.");
		Map<String, Long> noOfEmps = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		noOfEmps.entrySet().stream()
				.filter(dep -> dep.getValue() > 1)
					.map(Map.Entry::getKey)
					.forEach(System.out::println);
	}







}
