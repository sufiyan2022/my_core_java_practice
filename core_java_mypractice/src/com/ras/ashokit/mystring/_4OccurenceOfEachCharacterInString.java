package com.ras.ashokit.mystring;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 *  Write a program to find Occurrence of Each character in given Stirng
 *  
 *  	Input : hello
 *  	Ouput : h-1 e-1 l-2 o-1
 */

public class _4OccurenceOfEachCharacterInString {
public static void main(String[] args) {
	
//	Approach: 1
	String input = "hello";
	Map<Character, Integer> map = new LinkedHashMap<>();
	char[] chars = input.toCharArray();
	for(Character ch : chars) {
		if(!map.containsKey(ch)) {
			map.put(ch, 1);
		}else {
			int count = map.get(ch);
			map.put(ch, ++count);
		}
	}
	System.out.println(map);
	
//	Approach: 2
//	Java 8
	Map<Character,Long> count = input.chars().mapToObj(ch -> (char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	count.forEach((k,v)-> System.out.println(k+"->" + v));
}
}
