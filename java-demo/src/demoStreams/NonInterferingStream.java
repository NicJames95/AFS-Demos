package demoStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NonInterferingStream {

	public static void main(String[] args) {
		// Creating a List the type of ArrayList using Arrays class to convert a List to ArrayList  
		List<String> products = new ArrayList<>(
				Arrays.asList("product1", "product2", "product3", "product4", "product5"));
		// Creating parallel stream initializing it as vStream 
		Stream<String> vStream = products.parallelStream();
		// Trying to add a new product to show non-interfering case  
		products.add("product6");
		// Using the stream in order to filter, passing the filtering criteria that a string length 
		// should be greater than 3, then applying .map in order to convert all the filtered strings 
		// to uppper case 
		vStream.filter(str -> str.length() > 3).map(String::toUpperCase)
		// Sorting it and using forEach terminal method in order to print the output 
		.sorted().forEach(System.out::println);
				

	}

}
