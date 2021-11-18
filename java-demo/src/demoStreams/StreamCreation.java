package demoStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCreation {

	public static void main(String[] args) {
		//Creating a collection of list using arrays class as list method
		List<Integer> numbers = Arrays.asList(12,13,14,15);
		
		//Retrieving after creating a stream
		//Using numbers then creating stream with .stream method 
		//After creating stream applying map and passing lambda expression which squares the value
		List<Integer> square = numbers.stream().map(x -> x*x).
	    //Then using collect to generate the output list and passing collectors.toList in order to convert the stream to List
				collect(Collectors.toList());
		// Finally printing the list which contains squared values of each element present in the source list 
		System.out.println(square);

	}
	
	
	

}
