package com.ras.convertingoneformtoanother;

import java.util.Arrays;
import java.util.List;

public class _3Arrays_asListmethod {
public static void main(String[] args) {
	
//	Example 1: Converting an array of strings to a list
	
	String[] array = {"apple","banana","orange"};
	List<String> list = Arrays.asList(array);
	System.out.println(list);
	
//	Output:
//		[apple, banana, orange]
	
//	Example 2: Modifying elements in the list
	
	list.set(1, "grape");
	System.out.println(list);
	System.out.println(Arrays.toString(array));
	
//	Output:
//		[apple, grape, orange]
//		[apple, grape, orange]
	
	
}
}
