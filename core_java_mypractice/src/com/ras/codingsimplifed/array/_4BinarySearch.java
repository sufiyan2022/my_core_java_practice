package com.ras.codingsimplifed.array;

public class _4BinarySearch {
public static void main(String[] args) {
	
	int arr[] = {12,34,45,65,83};
	
	_4BinarySearch obj = new _4BinarySearch();
	int i = obj.searchIndex(arr, 6, 0, arr.length-1 );
	if(i == -1) {
		System.out.println("Value does not exists in array");
	}else {
		System.out.println(i);
	}
	
}

	public int searchIndex(int a[], int val, int start, int end) {
		if(a.length == 0 ||  start > end) {
			return -1;
		}
		int mid = (start+end)/2;
		
		if(val == a[mid]) {
			return mid;
		}
		if(val > a[mid]) {
			return searchIndex(a, val, mid+1, end);
		}else {
			return searchIndex(a, val, start, mid-1);
		}
	}
}
