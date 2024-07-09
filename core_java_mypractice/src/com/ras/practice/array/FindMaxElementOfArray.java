package com.ras.practice.array;

import java.util.Arrays;

public class FindMaxElementOfArray {
public static void main(String[] args) {
	
	int arr[] = { 0, 1, 4, 5, 7, 8, 9, 10, 2, 6, 3 };
	
	int max_value = 0;
	int temp;
	for(int ele : arr) {
		temp = ele;
		if(temp > max_value) {
			max_value = temp;
		}
	}
	System.out.println("Max Element of an Array is :"+ max_value);
	
	Arrays.sort(arr);
	System.out.println("Max Element of an array is : " + arr[arr.length-1]);
	
	

}
}
