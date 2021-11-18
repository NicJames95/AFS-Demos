package demoStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamFindApi {

	public static void main(String[] args) {
		// Creating a list using Arrays.asList and passing values
		List<Integer> list = Arrays.asList(30, 50, 70, 90, 110);
		//findFirst
		// findFirst will return an optional which is a container object which may contain or may not contain a value
		// Using list to generate the stream and invoking findFirst method of the stream and returns a value if one is present or not 
		Optional<Integer> output = list.stream().findFirst();
		
		if (output.isPresent()) {
			System.out.println("data is="+output.get());
		}
		else {
			System.out.println("sorry No data");
		}
		
		//anyMatch
		// anyMatch will take a predicate and it will return whether an element of the stream matches the provided predicate(condition)
		// Using the same stream then calling anyMatch and passing a lambda expression which takes n(number)
		// And executes an expression n into n+1 divided by 4 equal to 5 
		// if a value matches the predicate it will display it 
		boolean output2 = list.stream().anyMatch(n 
				-> (n * (n + 1)) / 4 == 5);
		System.out.println("output2="+output2);
		
		//allMatch
		// allMatch is also a predicate returns whether an element of the stream matches the provided predicate or not 
		// it may not evaluate the predicate on all elements 
		// also called Short Circuit Terminal Operation
		// Creating a stream calling allMatch and evaluating lambda expression to check if all the elements are divisible by 2
		
		boolean output3 = list.stream().allMatch(n 
				-> n%2 == 0);
		System.out.println("output3="+output3);
		
		//none match 
		// also Short Circuit Terminal Operation
		// Executes if n is less than 0
		boolean output4 = list.stream().noneMatch(n 
				-> n<0);
		System.out.println("output4="+output4);
		
		//findAny 
		// returns an optional that describes some elements of the stream or an empty optional if the stream is empty 
		// findAny method returns any element from the stream but there might be a case where we require only the first element 
		// in which case use findFirst()
		IntStream intStream=IntStream.of(42,51,82,10,14,18).parallel();
		intStream=intStream.filter(num->num%3==0);
		OptionalInt int1=intStream.findAny();
		if (int1.isPresent())
		{
			System.out.println("int1 value="+int1.getAsInt());
		}
		else
		{
			System.out.println("no value match");
		}

	}

}
