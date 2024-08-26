package com.ras.drunken.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/*
 * Array Multiplication using stream
 * 
 * HOw to multiply array with itself
 * Multiply the elements in array using Java 8 provided feature 
 */
public class _2ArrayMultiplicationUsingStream {
public static void main(String[] args) {
	
	int intArray[] = {1,2,3,4,5};
	int result = IntStream.of(intArray).reduce(1,(a,b)-> a*b);
	System.out.println(result);
	System.out.println("======another reduce(IntBinaryOperator)======");
	OptionalInt reduce = IntStream.of(intArray).reduce((a,b)-> a*b);
	System.out.println(reduce.getAsInt());
	
	System.out.println("====================");
	
	Integer[] inputArray= {1,2,3,4,5};
//	Integer[] inputArray= {};
	List<Integer> numList = Arrays.asList(inputArray);
	Optional<Integer> output = numList.stream().reduce((a,b)->a*b);
	if(output.isPresent()) {
		System.out.println("Arrays Multiply element using java 8 :" + output.get());
	}else {
		System.out.println("Empty Array/List");
	}
	
//	Using foreach
	System.out.println("=======Using foreach========");
	if(numList.size()>0) {
	Integer output2 = 1;
	for (Integer integer : numList) {
		output2 *= integer;
	}
	System.out.println(output2);
	}else {
		System.out.println("Empty Array/List");
	}
}
}
