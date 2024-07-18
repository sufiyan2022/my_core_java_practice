package com.ras.immutableclass;

public class Lab1216 {
public static void main(String[] args) {
	
	StringBuilder sb = new StringBuilder("Sri");
	long arr[] = new long[] {31903290,65799999};
	Student2 st = new Student2(99, sb, arr);
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

final class Student2{
	
	private final int sid;
	private final StringBuilder name;
	private final long[] phone;
	
	public Student2(int sid, StringBuilder name, long[] phone) {
		this.sid = sid;
		this.name = new StringBuilder(name);
		this.phone = new long[phone.length];
		System.arraycopy(phone, 0, this.phone, 0, phone.length);
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


	public String toString() {
		String msg = sid+", "+name;
		for(long val: phone)
			msg += ", "+val;
		return msg;
	}
}