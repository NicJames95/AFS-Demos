package demoStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcurrentStreams {

	public static void main(String[] args) {
		// Declaring a simple list which contains integer values 
		List<Integer> values=Arrays.asList(10,201,30,41);
		// Creating a stream, passing the values in the form of String
		        Stream.of("1","2","3","4","5")
		// Then we iterate since we are not using .parallel, it is a sequential stream
		//and it will print values in the sequence
		        .forEach(System.out::print);
		// Reflects parallel stream where use stream.of and pass values 
		        Stream.of("a","b","c","d","e")
		// Use .parallel in order to ensure that concurrently multiple threads will execute
		        .parallel()
		// Then using for each to print the value 
		        .forEach(System.out::print);
		// Creating a stream out of values from line 11, then .parallel in order to ensure that we 
		// Specify we want parallel streams, then .filter to filter the value, and reduce 
		// Which will reduce to the sum of all even numbers 
		       int evenNumber=values.stream().parallel().filter(x->x%2==0).reduce(0,(a,i)->a+i);
		// Printing the value 
		        System.out.println(evenNumber);
	    

	}

}
