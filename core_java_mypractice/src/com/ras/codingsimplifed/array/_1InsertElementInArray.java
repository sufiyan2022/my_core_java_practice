package com.ras.codingsimplifed.array;

/*
 *  insert an element into array | at end | at start | at any given position
 */

public class _1InsertElementInArray {

	int count = 0;
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
//		inserting element into array ony by one
//		a[0] = 12;
//		a[1] = 34;
//		a[2] = 15;
////		a[3] = 67; //if not provided default value 0
//		a[4] = 48;
		
////		printing the elements
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
		
////		insert value using for loop
//		System.out.println("\n========");
//		for(int j=0; j<a.length;j++) {
//			a[j] = j+1;
//		}
//		
////		printing the elements
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
		
		System.out.println("\ndefining print method");
		_1InsertElementInArray obj = new _1InsertElementInArray();
		obj.print(a);
		
		for(int j=0; j<a.length;j++) {
			obj.insert(a, j+1);
		}
		
		System.out.println("\nPrinting values");
		obj.print(a);
		
		System.out.println("\nInserting at start");
		obj.insertAtStart(a, 34);
		obj.print(a);
		obj.insertAtStart(a, 35);
		obj.print(a);
		
		obj.insertAtPosition(a, 2, 99);
		obj.print(a);
		
		obj.insertAtPosition(a, 2, 100);
		obj.print(a);
	}
	
//	inserting the element
	public void insert(int a[], int val) {
		a[count++] = val;
	}
	
	public void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
//	insert at start position
	public void insertAtStart(int a[], int val) {
		for(int i=a.length-1;i>0;i--) {
			a[i] = a[i-1];
		}
//		for(int i=count-1;i>0;i--) {
//			a[i] = a[i-1];
//		}
		a[0] = val;
	}
	
	public void insertAtPosition(int[] a, int position, int val) {
		for(int i=a.length-1;i>position;i--) {
			a[i] = a[i-1];
		}
		a[position] = val;
	}

}
