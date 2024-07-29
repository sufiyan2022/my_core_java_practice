package com.ras.logical2;

/*
 *  Fibonacci Series: 
 *  The Fibonacci sequence is a series of numbers where the next term is the sum of previous two terms.
 *  Fibonacci : fn = f(n-1) + f(n-2)
 *  Thre first two terms of the Fibonacci sequence is 0 followed by 1.
 *  0 1 1 2 3 5 8 13 21 34...
 */


public class FibonacciSeries {
public static void main(String[] args) {
	
//	using for loop
	
//	int n = 10;
//	int firstNum = 0, secondNum = 1;
//	for(int i=1;i<=n;i++) {
//		System.out.print(firstNum + " ");
//		int nextNum = firstNum + secondNum;
//		firstNum = secondNum;
//		secondNum = nextNum;
//	}
	
//	using while loop
	
//	int n = 10;
//	int previous = 0, next = 1, result;
//	int i = 1;
//	while(i<=n) {
//		System.out.print(previous + " ");
//		result = previous + next;
//		previous = next;
//		next = result;
//		i++;
//		
//	}
	
//	using recursive
	
	int n = 10;
	for(int i=0;i<n;i++) {
		int result = fibonacci(i);
		System.out.print(result + " ");
	}
}
	public static int fibonacci(int n) {
		if(n==0 || n==1) {
			return n;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}
