package com.ras.basicconcept.callbyvalueandcallbyrefrence;

/*
 *  Output:Output:
 *  main begins :99
	m1 begins : 99
	m1 ends : 109
	main ends : 109

 */

public class Lab746 {
	public static void main(String[] args) {

		Hai hai = new Hai();
		hai.a = 99;
		System.out.println("main begins :" + hai.a);
		Hello hello = new Hello();
		hello.m1(hai);
		System.out.println("main ends : " + hai.a);
	}
}

class Hello {

	public void m1(Hai hai) {
		System.out.println("m1 begins : " + hai.a);
		hai.a = hai.a + 10;
		System.out.println("m1 ends : " + hai.a);
	}
}

class Hai {
	int a;
}
