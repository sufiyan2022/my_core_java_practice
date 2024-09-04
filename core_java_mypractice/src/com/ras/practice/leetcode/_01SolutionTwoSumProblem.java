package com.ras.practice.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class _01SolutionTwoSumProblem {
public static void main(String[] args) {
	
//	int nums[] = {2,7,11,15};
//	int nums[] = {3,2,4};
	int nums[] = {2,11,15,7};
	System.out.println(Arrays.toString(twoSum(nums,9)));
}

	public static int[] twoSum(int nums[], int target) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int req_num = target - nums[i];
			if(hm.containsKey(req_num)) {
				int [] arr = {hm.get(req_num),i};
				return arr;
			}
			hm.put(nums[i], i);
		}
		return null;
	}
}
