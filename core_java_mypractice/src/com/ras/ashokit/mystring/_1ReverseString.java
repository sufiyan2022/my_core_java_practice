package com.ras.ashokit.mystring;

/*
 *  Reverse a String 
 *  4 Approaches with example
 *   1) Using toCharArray()
 *   2) Using charAt(int index)
 *   3) Using StringBuffer reverse() method
 *   4) Using StringBuilder reverse() method
 */
public class _1ReverseString {
public static void main(String[] args) {
	
//	Approach: 1
//	Using toCharArray() method
	String str = "hello";
	char[] ch = str.toCharArray();
	for(int i=str.length()-1;i>=0;i--) {
		System.out.print(ch[i]);
	}
	System.out.println();
	
//	Approach: 2
//	Using charAt(int index) method
	for(int i=str.length()-1;i>=0;i--) {
		System.out.print(str.charAt(i));
	}
	System.out.println();
	
//	Approach: 3
	StringBuffer sb = new StringBuffer(str);
	System.out.println(sb.reverse());
	
//	Approach: 4
	StringBuilder stringBuilder = new StringBuilder(str);
	System.out.println(stringBuilder.reverse());
}
}
