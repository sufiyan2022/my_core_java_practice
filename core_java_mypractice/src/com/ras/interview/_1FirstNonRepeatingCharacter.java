package com.ras.interview;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 *  asked in Ust gloabl
 */
public class _1FirstNonRepeatingCharacter {
	public static void main(String[] args) {

//		using bruteforce approach
		
		String str = "india";

//		for (int i = 0; i < str.length(); i++) {
//			boolean isRepeating = false;
//			for (int j = 0; j < str.length(); j++) {
//				if (i != j && str.charAt(i) == str.charAt(j)) {
//					isRepeating = true;
//					break;
//				}
//			}
//			if (!isRepeating) {
//				System.out.println("First Non Repeating character :" + str.charAt(i));
//				return;
//			}
//		}
//		System.out.println("No Non Repating character found.");
		
//		using java 8
		
		LinkedHashMap<Character, Long> charCountMap = str.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
		Character character = charCountMap.entrySet().stream().filter(en->en.getValue()==1).map(en->en.getKey()).findFirst().get();
		charCountMap.entrySet().stream().filter(en->en.getValue()==1).map(en->en.getKey()).findFirst().get();
		System.out.println(character);
	}
}
