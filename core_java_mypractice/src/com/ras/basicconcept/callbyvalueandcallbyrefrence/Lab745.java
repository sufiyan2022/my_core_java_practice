package com.ras.basicconcept.callbyvalueandcallbyrefrence;

/*
 *  call by value and call by reference.
 *   call by value:
 *   when you invoke a method by passing primitive data type then it is called as call by value mechanism.
 *   In the case of call by value, modification happen inside the called method will not be reflected to the caller method.
 *   
 *   call by reference: 
 *   when you invoke a method by passing reference data type then it is called  as call by reference mechanism.
 *   
 *   In the case of call by reference:
 *   when you modify property of the object then modification happen inside the called method will be reflected to caller method.
 *   when you modify reference itself then modifications happened inside the call method will not be reflected to the caller method.
 *   
 *    Output:
 *    	main begins: 99
		m1 begins : 99
		m1 ends : 109
		main ends: 99

 */

public class Lab745 {
public static void main(String[] args) {
	
	int a = 99;
	System.out.println("main begins: "+ a);
	Hello hello = new Hello();
	hello.m1(a);
	System.out.println("main ends: "+ a);
}
}

class Hello{
	
	void m1(int a) {
		System.out.println("m1 begins : "+ a);
		a = a+10;
		System.out.println("m1 ends : "+ a);
	}
}
