package com.ras.logical2;

public class Palindrome {
public static void main(String[] args) {
	
//	Example 1: Java Program to Check Palindrome String
	
	String str = "Radar", reverseStr = "";
	for(int i=str.length()-1;i>=0;i--) {
		reverseStr = str.charAt(i) + reverseStr;
	}
	if(str.toLowerCase().equals(reverseStr.toLowerCase())) {
		System.out.println(str + " is a palindrome String. ");
	}else {
		System.out.println(str + " is not a palindrome String.");
	}
	
//	Example 2: Java Program to Check Palindrome Number
	
	int num = 3553, reverseNum = 0, remainder;
	
	int originalNum = num;
	while(num!=0) {
		remainder = num%10;
		reverseNum = reverseNum*10+remainder;
		num = num/10;
	}
	if(originalNum == reverseNum) {
		System.out.println(originalNum + " is palindrome. ");
	}else {
		System.out.println(originalNum + " is not palindrome. ");
	}
}
}
