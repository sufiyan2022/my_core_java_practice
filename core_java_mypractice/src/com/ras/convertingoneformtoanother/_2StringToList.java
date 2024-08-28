package com.ras.convertingoneformtoanother;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 *  how to convert string values to list of values
 */

public class _2StringToList {
public static void main(String[] args) {
	
//	Example 1: Convert a comma-separated string to a list of strings
	
//	String str = "apple,banana,orange";
//	List<String> asList = Arrays.asList(str.split(","));
//	System.out.println(asList);
	
//	Example 2: Convert a comma-separated string to a list of integers
//	String str = "1,2,3,4,5";
//	List<Integer> list = Arrays.stream(str.split(","))
//								.map(Integer::parseInt)
//								.collect(Collectors.toList());
//	System.out.println(list);
	
//	Example 3: Convert a space-separated string to a list of strings
	
//	 String str = "apple banana orange";
//	 List<String> asList = Arrays.asList(str.split(" "));
//	 System.out.println(asList);
	
//	Example 4: Convert a string to a list of characters
	String str = "hello";
	List<Character> listChar = str.chars().mapToObj(c->(char)c).collect(Collectors.toList());
	System.out.println(listChar);
	
}
}
