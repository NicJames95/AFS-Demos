package demoStreams;

import java.util.stream.Stream;

public class InfiniteStreams {

	public static void main(String[] args) {
		//create a stream which starts with 0 and writing lambda expression n->n+2
		Stream.iterate(0, n->n+2)
		//Using .peek passing another lambda expression with num and it prints peeked at num; num will be infered as a value
		      .peek(num -> System.out.println("Peeked"
		      		+ " at: "+num))
		      //Adding .limit which is another intermediate function and we pass 5 to it
		      .limit(5)
		      //Finally using .forEach which is the terminal operation which prints the value
		      .forEach(System.out::println);

	}

}
