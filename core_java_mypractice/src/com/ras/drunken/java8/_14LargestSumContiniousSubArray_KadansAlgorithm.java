package com.ras.drunken.java8;

/*
 *  Largest or maximum sum subarray
 *   Kadane's Algorithm
 */
public class _14LargestSumContiniousSubArray_KadansAlgorithm {
public static void main(String[] args) {
	
	int arr[] = {8,9,-1,1,6,5,7,-6};
	int currMax = arr[0];
	int globalMax = arr[0];
	
	for(int i=1;i<arr.length;i++) {
	if(arr[i] < 0) {
		currMax = 0;
	}else {
		currMax += arr[i];
	}
	if(globalMax < currMax) {
		globalMax = currMax;
	}
	}
	System.out.println(globalMax);
}
}
