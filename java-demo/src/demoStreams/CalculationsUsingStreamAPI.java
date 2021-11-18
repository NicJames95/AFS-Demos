package demoStreams;

import java.util.stream.IntStream;

public class CalculationsUsingStreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating simple stream of type IntStream by using .of method and assigning values 
		IntStream stream = IntStream.of(20, 40, 60, 10, 340, 50, 90);
		// Using max and converting to primitive type by using .getAsInt
		int maximum = stream.max().getAsInt();
		
		stream = IntStream.of(20, 40, 60, 10, 340, 50, 90);
		// Initializing minimum to stream and applying min method and returning it as Int with getAsInt
		int minimum = stream.min().getAsInt();
		
		stream = IntStream.of(20, 40, 60, 10, 340, 50, 90);
		double average = stream.average().getAsDouble();
		
		stream = IntStream.of(20, 40, 60, 10, 340, 50, 90);
		int sum = stream.sum();
		// Displaying the output 
		System.out.println("maximum value : " + maximum);
		System.out.println("minimum value : " + minimum);
		System.out.println("average value : " + average);
		System.out.println("Sum Total : " + sum);

	}

}
