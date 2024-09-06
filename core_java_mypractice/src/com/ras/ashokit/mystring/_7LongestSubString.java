package com.ras.ashokit.mystring;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 *  Write a program to find Longest substring Length which does not contain repeating characters in given String.
 *   
 *   Input : abbac
 *   Output: bac -> length: 3
 *   
 *   Input: abcabcbb
 *   Output: abc -> Length: 3 
 */
public class _7LongestSubString {
public static void main(String[] args) {
	
//	lengthOfLongestSubString("abbac");
	lengthOfLongestSubString("abcbdaac");
}

	public static void lengthOfLongestSubString(String s) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		String longestSubString = null;
		int longestSubStringLength = 0;
//		char[] arr = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			char currentChar = s.charAt(i);
//			char currentChar = arr[i];
			if(map.containsKey(currentChar)) {
				i = map.get(currentChar);
				map.clear();
//				map.put(currentChar, i);
			}else {
				map.put(currentChar, i);
//				i = map.get(currentChar);
//				map.clear();
			}
			if(map.size() > longestSubStringLength) {
				longestSubStringLength = map.size();
//				longestSubString = map.keySet().toString();
				longestSubString = mapToString(map);
			}
		}
		System.out.println("The longest subString : "+ longestSubString);
		System.out.println("The longest subString length : "+ longestSubStringLength);
	}
	
		public static String mapToString(Map<Character, Integer> map) {
			StringBuilder sb = new StringBuilder();
			for(Character c : map.keySet()) {
				sb.append(c);
			}
			return sb.toString();
		}
}
