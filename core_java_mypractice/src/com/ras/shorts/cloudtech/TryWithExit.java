package com.ras.shorts.cloudtech;

public class TryWithExit {
public static void main(String[] args) {
	
	try {
		System.out.println("In try block");
		System.exit(0);
	}catch(Exception e) {
		System.out.println("In catch block");
	}finally {
		System.out.println("In finally block");
	}
}
}
