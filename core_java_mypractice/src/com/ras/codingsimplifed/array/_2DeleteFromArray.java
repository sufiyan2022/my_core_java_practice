package com.ras.codingsimplifed.array;

/*
 *  Delete the element from an array | from end | from given position
 */
public class _2DeleteFromArray {
	
	public static int count = 5;
	
public static void main(String[] args) {
	
	int a[] = {12, 34, 45, 6, 13};
	
	_2DeleteFromArray obj = new _2DeleteFromArray();
	obj.print(a);
	
//	delete end element
//	obj.deleteFromEnd(a);
//	obj.print(a);
	
//	delete specified element
//	obj.deleteValue(a, 34);
//	obj.print(a);
	
//	delete from position
	obj.deleteFromPosition(a, 2);
	obj.print(a);
}
	
	public void print(int a[]) {
		for(int i=0;i<count;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public void deleteFromEnd(int a[]) {
		if(a.length <= 0) {
			return;
		}
		count--;
	}
	
	public void deleteValue(int a[], int val) {
		int i;
		for(i=0;i<count;i++) {
			if(a[i] == val)
				break;
		}
		if(i == count) {
			System.out.println("Value does not exits.");
			return;
		}
		for(int j=i;j<count-1;j++) {
			a[j] = a[j+1];
		}
		count--;
	}
	
	public void deleteFromPosition(int a[], int position) {
		if(position > count || position <= 0 ) {
			System.out.println("Invalid Position ");
			return;
		}
		for(int i=position-1; i<count-1; i++) {
			a[i] = a[i+1];
		}
		count--;
	}
}
