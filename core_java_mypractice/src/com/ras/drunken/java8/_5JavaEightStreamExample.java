package com.ras.drunken.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 *  empList having properties name, id, city, age
 *  employee object has 4 properties
 *  asking filter out the employee based on age. if age>25. get all the emp list
 *  Asked in HCL
 */
public class _5JavaEightStreamExample {
public static void main(String[] args) {
	
	List<Employee3> empList = createEmployeeList();
	List<Employee3> outputList = empList.stream().filter(emp -> emp.getAge()>25).collect(Collectors.toList());
	outputList.forEach(emp -> System.out.println(emp));
//	outputList.forEach(System.out::println); //another way to write.
	
	
	/*
	 * Another ques: max age is 29. if age>30 then what will happen to output.
	 * 
	 * Ans: empty List will come
	 * 
	 * In what senario we are going to use map.
	 * map(function) : map will act on each object and it will return the object.
	 * filter(predicate) : filter will filter the stream base on the predicate.
	 */
	System.out.println();
	List<String> outputList2 = empList.stream().map(Employee3::getName).collect(Collectors.toList());
	outputList2.forEach(emp -> System.out.println(emp));
}	
	public static List<Employee3> createEmployeeList(){
		List<Employee3> empList = new ArrayList<>();
		Employee3 e1 = new Employee3("Amit", "1", "Ajmair", 21);
		Employee3 e2 = new Employee3("Raj", "2", "Pune", 23);
		Employee3 e3 = new Employee3("Das", "3", "Noida", 25);
		Employee3 e4 = new Employee3("Rishab", "4", "Jaipur", 27);
		Employee3 e5 = new Employee3("Anvesh", "5", "Varanasi", 29);
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		return empList;
	}
}
 class Employee3{
	 
	 private String name;
	 private String id;
	 private String city;
	 private int age;
	 
	public Employee3(String name, String id, String city, int age) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
		this.age = age;
	}
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee3 [name=" + name + ", id=" + id + ", city=" + city + ", age=" + age + "]";
	}
	 
	 
 }