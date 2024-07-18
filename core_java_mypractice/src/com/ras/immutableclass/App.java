package com.ras.immutableclass;

/*
 *  If the Address class is a third-party class that you cannot modify, you can still achieve immutability 
 *  by wrapping it in an immutable class. This involves creating a deep copy of the Address object when 
 *  it is passed to the Employee constructor and when it is returned by the getter method.
 */
public class App {
public static void main(String[] args) {
	
	Address address = new Address("delhi");
	Employee emp = new Employee(new Integer(10), "raj", address);
	
	System.out.println(emp.getId());
	System.out.println(emp.getName());
	System.out.println(emp.getAddress());
	
	// Trying to modify the address returned by getAddress
	emp.getAddress().city = "btm"; // This should not affect the immutableEmp's address
	
	// Attempting to modify the Address object
//	address.city = "btm";    // This should not affect the immutableEmp's address
	
	System.out.println(emp.getId());
	System.out.println(emp.getName());
	System.out.println(emp.getAddress());
	
}
}
