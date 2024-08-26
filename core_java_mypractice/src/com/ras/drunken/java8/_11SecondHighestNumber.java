package com.ras.drunken.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 *  Second Highest Number
 */

public class _11SecondHighestNumber {
public static void main(String[] args) {
	
	int input[] = {12,16,11,18,22,19,20,45,45};
	
//	Approach: 1 -> not getting if duplicate element
//	Arrays.sort(input);
//	System.out.println(input[input.length-2]);
	
//	Approach: 2 -> not getting if duplicate element
//	Approach: 1 and 2 are same, bcoz inbuild also using same way
	for(int i=0;i<input.length;i++) {
		for(int j=i+1;j<input.length;j++) {
			if(input[i] > input[j]) {
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
			}
		}
	}
	
	System.out.println(input[input.length-2]);
	
//	Approach: 3 -> correct way
	int first = Integer.MIN_VALUE;
	int second = Integer.MIN_VALUE;
	for(int i=0;i<input.length;i++) {
		if(input[i] > first) {
			second = first;
			first = input[i];
		}else if(input[i] > second && input[i] != first){
			second = input[i];
		}
	}
	System.out.println("Second highest is : " + second);
	
//	Approach: 4 - Java 8
	int result = Arrays.stream(input).boxed(). distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println("Second High Using stream : "+ result);
	
	
}
}
