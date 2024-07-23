package com.ras.shorts.cloudtech;

public class StaticBlock {

	static {
		System.out.println("Statci block -1");
	}

	static {
		System.out.println("Statci block -2");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
	}
}
