package com.ras.drunken.java8;

import java.util.Arrays;

/*
 *  Smallest missing number
 */

public class _17SmallestMissingNumber {
public static void main(String[] args) {
	
	int arr[] = {2,4,6,1};
	Arrays.sort(arr);
	int res = 1;
	for(int i=0;i<arr.length;i++) {
		if(arr[i] == res) {
			res++;
		}else {
			System.out.println("Smallest Missing number : "+ res);
			break;
		}
	}
}
}
