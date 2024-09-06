package com.ras.ashokit.mystring;

/* WAJP to reverse each word of a String
 *  Reverse Each word in String
 *  
 *  	Input: java code
 *  	Output: avaj edoc
 */
public class _3ReverseEachWord {
public static void main(String[] args) {
	
	String input = "java code";
	System.out.println("Original String: "+ input);
	String[] words = input.split(" ");
	String output = "";
	for(String word : words) {
		String reversedWrod = "";
		for(int i=word.length()-1; i>=0;i--) {
//			reversedWrod += String.valueOf(word.charAt(i));
			reversedWrod += word.charAt(i);
		}
		output += reversedWrod+" ";
	}
	System.out.println("Reversed String: "+ output);
}
}
