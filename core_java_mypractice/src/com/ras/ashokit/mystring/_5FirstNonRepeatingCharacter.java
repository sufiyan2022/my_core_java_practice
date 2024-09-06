package com.ras.ashokit.mystring;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 *  Java Program to find First Non Repeating Character in String
 */

public class _5FirstNonRepeatingCharacter {
public static void main(String[] args) {
	
	String input = "AABCDBECF";
	
//	Approach: 1
	for(int i=0;i<input.length();i++) {
		boolean unique = true;
		for(int j=0;j<input.length();j++) {
			if(i!=j && input.charAt(i) == input.charAt(j)) {
				unique = false;
				break;
			}
		}
		if(unique) {
			System.out.println(input.charAt(i));
			break;
		}
	}
	
//	Approach: 2
	Map<Character, Integer> map = new HashMap<>();
	for(int i=0;i<input.length();i++) {
		char ch = input.charAt(i);
		if(map.containsKey(ch)){
			int value = map.get(ch);
			map.put(ch, value+1);
		}else {
		map.put(ch, 1);
		}
	}
	for(Entry<Character,Integer> en : map.entrySet()) {
		if(en.getValue() == 1) {
			System.out.println(en.getKey());
			break;
		}
	}
}
}
