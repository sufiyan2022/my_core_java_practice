package com.ras.basicconcept.callbyvalueandcallbyrefrence;

/*
 *  Output:
 *  main begins :99
	m1 begins : 99
	m1 ends : 109
	main ends : 99

 * 
 */

public class Lab748 {
public static void main(String[] args) {
	
	Hai hai = new Hai();
	hai.a = 99;
	Hello hello = new Hello();
	System.out.println("main begins :"+ hai.a);
	hello.m1(hai.a);
	System.out.println("main ends : "+ hai.a);
}
}

class Hello{
	
	void m1(int a) {
		System.out.println("m1 begins : "+ a);
		a = a+10;
		System.out.println("m1 ends : "+ a);
	}
}

class Hai{
	int a;
}