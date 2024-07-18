package com.ras.immutableclass;

/*
 *  Employee Class (Immutable Wrapper Around Third-Party Employee)
 */

public final class Employee {

	private final Integer id;
	private final String name;
	private final Address address;
	
	public Employee(Integer id, String name, Address address) {
		this.id = id;
		this.name = name;
//		this.address = address;
		// Creating a new Address object to ensure immutability
		this.address = new Address(address.city);
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
//		return address;
		// Returning a new Address object to ensure immutability
		return new Address(address.city);
	}
	
	
}
