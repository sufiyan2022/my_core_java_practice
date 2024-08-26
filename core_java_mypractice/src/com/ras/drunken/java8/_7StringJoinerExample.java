package com.ras.drunken.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 *  String Joiner:
 *  Input = Hello How are you
 *  Output = [Hello-How-are-you]
 */
public class _7StringJoinerExample {
public static void main(String[] args) {
	
//	Using StringBuilder
	
	String input = "Hello How are you";
	StringBuilder sb = new StringBuilder(input);
	
	for(int i=0;i<sb.length();i++) {
		if(sb.charAt(i) == ' ')
			sb.setCharAt(i, '-');
	}
	String output = sb.toString();
	System.out.println(output);
	
//	Using StringJoiner
	
//	String[] inputArray = input.split(" ");
//	StringJoiner sJoiner = new StringJoiner("-","[","]");
//	for(String inputArr : inputArray) {
//		sJoiner.add(inputArray);
//	}
	
	List<String> inputList = Arrays.asList("Hello","How","are","you");
	String output2 = inputList.stream().collect(Collectors.joining("-"));
	System.out.println(output2);
}
}
