package com.ras.ashokit.mystring;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
 *  Remove Duplicate Characters in Given String
 *  4 Approaches with example
 *   1) Using java8
 *   2) Using indexOf(..)
 *   3) Using Character Array
 *   4) Using Set interface method
 */

public class _2RemoveDuplicateCharacter {
public static void main(String[] args) {
	
	String str = "programming";
	
//	Approach: 1
	str.chars().distinct().mapToObj(c->String.valueOf((char)c)).forEach(System.out::print);
	System.out.println();
//	String result = str.chars().distinct().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
//	System.out.println("Original String: " + str);
//    System.out.println("String after removing duplicates: " + result);
//    System.out.println();
	
//	Approach: 2
	StringBuilder sb = new StringBuilder();
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		int index = str.indexOf(ch, i+1);
		if(index == -1) {
			sb.append(ch);
		}
	}
	System.out.println(sb.toString());
	
//	Approach: 3
	StringBuilder sb2 = new StringBuilder();
	char[] ch = str.toCharArray();
	for(int i=0;i<ch.length;i++) {
		boolean repeated = false;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i] == ch[j]) {
				repeated = true;
				break;
			}
		}
		if(!repeated) {
			sb2.append(ch[i]);
		}
	}
	System.out.println(sb2);
	
//	Approach: 4
	StringBuilder sb3 = new StringBuilder();
	Set<Character> set = new LinkedHashSet<>();
	for(int i=0;i<str.length();i++) {
		set.add(str.charAt(i));
	}
	for(Character c: set) {
		sb3.append(c);
	}
	System.out.print(sb3);
}
}
