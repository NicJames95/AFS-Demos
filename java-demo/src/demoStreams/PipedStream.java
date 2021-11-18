package demoStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PipedStream {

	public static void main(String[] args) {
		// Declaring an array that holds certain values in form of List 
		// In order to build the list we use arrays Class and asList method
		List<Integer> array = Arrays.asList(2,3,4,5);
		// Trying to create a square set of the values which are present in the list 
		Set<Integer> squareSet = 
		// First we create the stream, then we use map to generate the squared value 
		// Finally we convert to list by using .collect passing Collectors.toSet
				array.stream().map(x->x*x).collect(Collectors.toSet());
		// Printing the values which are squared values of elements present in the array
		   System.out.println(squareSet);
		// Next we want to reduce, we want to return values after adding all even numbers
		// to do that we have declared int evenNumbers 
		   int evenNumbers = 
		// Which is initialized to array.stream to build the stream then we are 
		// Filtering to get only even numbers. Finally, we call to reduce in a 
		// Chained method in order to ensure we are able to build a pipe passing (0
		// And out, i) as parameter to lambda expression which returns out+i
				   array.stream().filter(x->x%2==0).reduce(0,(out,i)-> out+i);
		// Finally we print the value which is evenNumbers, which prints the total sum of
		// value of all the even integers present in the list 
		   System.out.println(evenNumbers);

	}

}
