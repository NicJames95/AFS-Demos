package demoLists;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpresssionsSample {

	public static void main(String[] args) {
		// Declaration of numbers an arrayList 
		
		List<Integer> numbers=new ArrayList<Integer>();
		// Adding numbers to the arrayList 
		numbers.add(10);
		numbers.add(15);
		numbers.add(12);
		numbers.add(17);
		numbers.add(9);
		// Scenario-1 : we want to print all the numbers in sorted order 
		// approach-1
		// numbers.stream to generate a stream, then we chain .sorted to arrange in ascending order
		// forEach to iterate in the stream get the number sorted and print the number
		numbers.stream().sorted().forEach(number -> {
			System.out.println(number);
		});
		// Scenario-1
		// approach-2
		// numbers.stream to generate the stream .sorted to arrange and .forEach 
		// Now the lambda expression is replaced with method reference (System.out::println) System.out=Object println=method
		// Here we are modifying the arguments before passing it to other methods 
		numbers.stream().sorted().forEach(System.out::println);

	}

}
