package demoStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String[] args) {
		//Creating an instance of List 
		List<String> stringList = new ArrayList<String>();
		//Adding three elements to List 
		stringList.add("ONE");
		stringList.add("TWO");
		stringList.add("THREE");
		//Creating a stream by calling .stream method of the list class
		Stream<String> stream = stringList.stream();
		long count = stream
				//After creating the stream we are using various operations like stream.map
				// passing the value which will be implicitly inferred and it returns value.lowerCase 
				     .map((value) -> {return value.toLowerCase();})
				// Adding .count which is a terminal method
				     .count();
		        // Printing the count
				// It returns to the count of values which are present in Stream after returning its Lower Case version
		System.out.println("count = " + count);

	}

}
