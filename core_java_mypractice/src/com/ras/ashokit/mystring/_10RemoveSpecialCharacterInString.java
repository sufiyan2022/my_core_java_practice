package com.ras.ashokit.mystring;
/*
 *  Java program to remove Special character in String
 *  Input: $ja!va&st%ar
 *  Output: javastar
 */

public class _10RemoveSpecialCharacterInString {
	public static void main(String[] args) {

		String str = "$ja!va&st%ar";
		
//		Approach: 1
		
		String plainStr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainStr);
	}
}
