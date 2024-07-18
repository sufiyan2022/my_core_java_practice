package com.ras.immutableclass;

public class Address {

	String city;

	public Address(String city) {
		super();
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
		return "Address [city=" + city + "]";
	}
	
	
}
