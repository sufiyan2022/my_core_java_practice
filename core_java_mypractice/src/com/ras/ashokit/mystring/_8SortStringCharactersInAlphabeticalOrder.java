package com.ras.ashokit.mystring;
/*
 *  Java Program to Sort String Characters in Alphabetical Order.
 *  
 *  String str = "rock";
 *  Approach: 1 -> Using sort method.
 *  Approach: 2 -> Without using sort method.
 */

import java.util.Arrays;

public class _8SortStringCharactersInAlphabeticalOrder {
public static void main(String[] args) {
	
	String str = "rock";
	
//	Approach:1
	
	char[] ch = str.toCharArray();
	for(int i=0;i<ch.length;i++) {
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i] > ch[j]) {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
			}
		}
	}
	System.out.println(new String(ch));
	
//	Approach: 2
	
	char[] charArray = str.toCharArray();
	Arrays.sort(charArray);
	System.out.println(new String(charArray));
}
}
