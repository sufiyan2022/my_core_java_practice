package com.ras.ashokit.mystring;

import java.util.Arrays;

/*
 *  Java Program to replace a character with it's occurrence in given String
 *  Note: Replace character 'T' with it's occurrence
 *   Input: OPENTEXT
 *   Output: OPEN1EX2
 */
public class _6ReplaceCharacterWithItsOccurence {
public static void main(String[] args) {
	
//	String input = "opentext";
	String input = "deloitte";
	char charToReplace = 't';
	
//	check char is present in the String
	if(input.indexOf(charToReplace) == -1) {
		System.out.println("Given character not present in String.");
		System.exit(0);
	}
	
//	way: 1
//	logic to replace character occurence in string
	
//	char[] arr = input.toCharArray();
//	
//	int cnt = 1;
//	for(int i=0;i<arr.length;i++) {
//		if(arr[i] == charToReplace) {
//			arr[i] = String.valueOf(cnt).charAt(0);
//			cnt++;
//		}
//	}
//	System.out.println(Arrays.toString(arr));
	
//	way: 2
//	logic to replace character occurence in string
	
	int cnt = 1;
	for(int i=0;i<input.length();i++) {
		char ch = input.charAt(i);
		if(ch == charToReplace) {
			input = input.replaceFirst(String.valueOf(charToReplace), String.valueOf(cnt));
			cnt++;
		}
	}
	System.out.println(input);
	
//	way: 3
	System.out.println("-------------");
	String input2 = "programmingprogram";
	char charToReplace2 = 'r';
	
	String result = replaceCharOccurences(input2, charToReplace2);
	System.out.println("Result : "+ result);
}

	public static String replaceCharOccurences(String input2, char charToReplace) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(int i=0;i<input2.length();i++) {
			char currentChar = input2.charAt(i);
			if(currentChar == charToReplace) {
				sb.append(count);
				count++;
			}else {
				sb.append(currentChar);
			}
		}
		return sb.toString();
	}
	
}
