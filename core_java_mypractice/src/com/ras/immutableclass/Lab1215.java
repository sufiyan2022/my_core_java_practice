package com.ras.immutableclass;

import java.util.Arrays;

public class Lab1215 {
public static void main(String[] args) {
	
	StringBuilder sb = new StringBuilder("Sri");
	long arr[] = new long[] {31903290,65799999};
	Student1 st = new Student1(99, sb, arr);
	System.out.println(st);
	
	System.out.println("Modifying the sb and arr");
	sb.append("Baba");
	arr[0] = 78787878;
	System.out.println(st);
	
	System.out.println("Accessing name and phone and modifying");
	StringBuilder  sb1 = st.getName();
	long arr2[] = st.getPhone();
	sb.append("Dande");
	arr[1] = 96969696;
	System.out.println(st);
}
}

final class Student1{
	
	private final int sid;
	private final StringBuilder name;
	private final long[] phone;
	
	public Student1(int sid, StringBuilder name, long[] phone) {
		super();
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}

	public int getSid() {
		return sid;
	}

	public StringBuilder getName() {
		return name;
	}

	public long[] getPhone() {
		return phone;
	}

//	@Override
//	public String toString() {
//		return "Student1 [sid=" + sid + ", name=" + name + ", phone=" + Arrays.toString(phone) + "]";
//	}
	
	public String toString() {
		String msg = sid+", "+name;
		for(long val: phone)
			msg += ", "+val;
		return msg;
	}
}