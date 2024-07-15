package com.ras.codingsimplifed.array;

/*
 *  Search a value in an Array
 */
public class _3SearchingAnElement {
public static void main(String[] args) {
	
	int a[] = {12,34,45,6,13};
	
	_3SearchingAnElement obj = new _3SearchingAnElement();
	int i = obj.searchIndex(a,12);
	if(i == -1) {
		System.out.println("Value does not exists.");
	}else {
		System.out.println(i);
	}
}

	public int searchIndex(int a[], int val) {
		if(a.length == 0) {
			return -1;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i] == val) {
				return i;
			}
		}
		return -1;
	}
}
