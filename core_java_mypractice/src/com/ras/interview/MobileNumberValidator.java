package com.ras.interview;

import java.util.Scanner;

public class MobileNumberValidator {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	String input = scanner.nextLine();
	try {
	validateMobileNumber(input);
	System.out.println("Valid Mobile phone number: "+ input);
	}catch(IllegalArgumentException e){
		System.out.println(e.getMessage());
	}
}

private static void validateMobileNumber(String input) {
	
	for(char ch : input.toCharArray()) {
		if(!Character.isDigit(ch)) {
			throw new IllegalArgumentException("You Have entered a character instead of a digit.");
		}
	}
	if(input.length()<10) {
		throw new IllegalArgumentException("You have entered less than 10 digits.");
	}
	if(input.length()>10) {
		throw new IllegalArgumentException("You have entered more than 10 digits.");
	}
}

}
