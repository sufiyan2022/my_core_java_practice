package com.ras.drunken.java8;

import java.util.function.Supplier;
import java.util.stream.Stream;

/*
 *  ReUsing the Stream.
 *  Can we re use a Stream or not.
 *  no: 
 */
public class _4ReUsingStream {
public static void main(String[] args) {
	String[] inputArray = {"Amit","ball","call","Amit","egg"};
	
	/*
	Stream<String> inputStream = Arrays.asList(inputArray).stream();
	inputStream.forEach(x -> System.out.println(x));
//	can we reuse stream
	long count = inputStream.filter(x -> "Amit".equals(x)).count();
//	Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed.
//	_4ReUsingStream.java:18
	System.out.println(count);
	
	*/
	
	Supplier<Stream<String>> inputStream = () -> Stream.of(inputArray);
	inputStream.get().forEach(x -> System.out.println(x));
	long count = inputStream.get().filter(x->"Amit".equals(x)).count();
	System.out.println(count);
}
}
