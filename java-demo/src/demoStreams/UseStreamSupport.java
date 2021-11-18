package demoStreams;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class UseStreamSupport {

	public static void main(String[] args) {
		// Creating a new Tree Set by using an array, we are passing 3 String values and 
		// are converting it to List and passing it to Tree Set to create a Tree Set of String values 
		Set<String> set = new TreeSet<>(Arrays.asList("Item1", "Item2", "Item3"));
		// Using StreamSupport class in order to build a stream using set.spliterator passing false
		Stream<String> stream = StreamSupport.stream(set.spliterator(), false);
		// Finally iterating in the stream by using stream.forEach and passing the instruction
		//that needs to be executed "System.out::println" where the string values will be infered
		stream.forEach(System.out::println);

	}

}
