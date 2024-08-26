package com.ras.drunken.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 *  Sort Employee using comparator in java8
 *  
 *   or How comparator can be used in java 8
 *   
 *   Multiple sorting using comparator
 */

public class _3ComparatorExampleJava8 {
	public static void main(String[] args) {

		List<Employee2> empList = new ArrayList<>();
		createEmployeeList(empList);

		System.out.println("Employee List before sorting");
		empList.forEach(emp -> System.out.println(emp.getName() + "----" + emp.getCity() + " "));

		System.out.println();
		System.out.println("Employee List After sorting");
		empList.sort(Comparator.comparing(Employee2::getName));
		empList.forEach(emp -> System.out.println(emp.getName() + "----" + emp.getCity() + " "));
		
		System.out.println();
		System.out.println("Employee List Reverse sorting");
		empList.sort(Comparator.comparing(Employee2::getName).reversed());
		empList.forEach(emp -> System.out.println(emp.getName() + "----" + emp.getCity() + " "));
		
		System.out.println();
		System.out.println("Based on multiple field we can sort");
		Comparator<Employee2> thenComparing = Comparator.comparing(Employee2 :: getName).thenComparing(Employee2:: getCity);
		empList.sort(thenComparing);
		empList.forEach(emp -> System.out.println(emp.getName() + "----" + emp.getCity() + " "));
	}

	public static void createEmployeeList(List<Employee2> empList) {
		Employee2 e1 = new Employee2();
		e1.setName("Arun");
		e1.setCity("Delhi");
		e1.setId("1");

		Employee2 e2 = new Employee2();
		e2.setName("Dinesh");
		e2.setCity("Noida");
		e2.setId("2");

		Employee2 e3 = new Employee2();
		e3.setName("Chaitanya");
		e3.setCity("Pune");
		e3.setId("3");

		Employee2 e4 = new Employee2();
		e4.setName("Laxman");
		e4.setCity("Bangalore");
		e4.setId("4");

		Employee2 e5 = new Employee2();
		e5.setName("Bhargav");
		e5.setCity("Agra");
		e5.setId("5");

		Employee2 e6 = new Employee2();
		e6.setName("Arun2");
		e6.setCity("Delhi2");
		e6.setId("6");

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
	}
}

class Employee2 {

	private String name;
	private String id;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
