package com.ras.drunken.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * 	Find out the times a word/number got repeated.
 * 
 *  input: 5,3,4,1,3,7,2,9,9,4
 *  
 *  output: 1-1, 2-1, 3-2, 4-2, 5-1, 7-1, 9-2
 *  
 *  Tech Mahindra.
 *   Input : "Amanda", "Rob", "Sunny", "Amanda", "Rob"
 *   OUtput: Rob-2, Sunny-1, Amanda-2
 */
public class _9FindDuplicateUsingStream {
public static void main(String[] args) {
	
	List<Integer> numList = Arrays.asList(5,3,4,1,3,7,2,9,9,4);
	Map<Integer, Long> output = numList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	output.forEach((x,y)-> System.out.println(x+"-"+y));
	
	
	List<String> strList = Arrays.asList("Amanda", "Rob", "Sunny", "Amanda", "Rob");
//	strList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((k,v)-> System.out.println(k+"-"+v));
	
//	legacy way:
	
	System.out.println("=======Legacy Way: ==========");
	Map<String, Integer> out = new HashMap<>();
	for(String s: strList) {
		if(out.containsKey(s)) {
			int count = out.get(s);
			count++;
			out.put(s, count);
		}else {
			out.put(s, 1);
		}
	}
	out.forEach((k,v)-> System.out.println(k+"-"+v));
}
}
