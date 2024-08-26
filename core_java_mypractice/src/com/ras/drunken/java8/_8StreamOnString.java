package com.ras.drunken.java8;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 *  Using Streams
 *  Find the vowels count in the stream
 *  Find the duplicate in the string.
 */
public class _8StreamOnString {
public static void main(String[] args) {
	
	String input = "hello hello";
	long count = input.chars().filter(x -> x=='a' || x=='e' || x=='i' || x=='o' || x=='u').count();
	System.out.println("No of Vowels: "+ count);
	
//	2nd way:
	
	char[] ch = input.toCharArray();
	long count1 = IntStream.range(0, ch.length)
            .mapToObj(i -> ch[i])
            .filter(x -> x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
            .count();
	System.out.println(count1);
	
//	find duplicates in the given input
	
	Map<String, Long> output3 = input.chars().mapToObj(x-> (char)x).collect(Collectors.groupingBy(Object :: toString, Collectors.counting()));
	output3.forEach((key,value)-> System.out.println(key+value));
	
}
}
