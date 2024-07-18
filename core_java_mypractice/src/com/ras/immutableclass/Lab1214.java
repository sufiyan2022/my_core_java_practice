package com.ras.immutableclass;

public class Lab1214 {
public static void main(String[] args) {
	
	Student st = new Student(99, "Sri", 657999999);
	System.out.println(st);
}
}

final class Student{
	
	private final int sid;
	private final String name;
	private final long phone;
	
	public Student(int sid, String name, long phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}

	public int getSid() {
		return sid;
	}

	public String getName() {
		return name;
	}

	public long getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
}
