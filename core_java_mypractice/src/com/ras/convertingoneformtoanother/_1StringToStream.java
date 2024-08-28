package com.ras.convertingoneformtoanother;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 
 *  How to convert String str = "india" to stream.
 */

public class _1StringToStream {
public static void main(String[] args) {
	
//	System.out.println("=====way-1======");
//	String str = "India";
//	IntStream stream = str.chars();
//	stream.forEach(System.out::println);
	
//	=================
//	String str = "India";
//	Stream<Character> mapToObj = str.chars().mapToObj(c->(char)c);
//	mapToObj.forEach(System.out::println);
	
	System.out.println("=====way-2======");
	String str = "India";
	IntStream stream = str.codePoints();
	stream.forEach(ch->System.out.println((char)ch));
}
}
