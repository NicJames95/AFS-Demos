package demoOOP;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;

public class ConsumerInterfaceExample {

	public static void main(String[] args) {
		
		//consumer
		// Creating consumer instance and ConsumerInterfaceExample is making a method reference to displayNames
		Consumer<String> consumer = ConsumerInterfaceExample::displayNames;
		// Adding name data using accept method and displays names by binding the consumer with method reference displayNames
		consumer.accept("cody");
		consumer.accept("blackwell");
		consumer.accept("alax");
		
		//supplier
		// Declaring the List
		List<String> employeeNames = Arrays.asList("alan", "cody", "alax", "blackwell");
		// Creating stream and iterating using forEach
		employeeNames.stream().forEach((name)->{
			// method reference to displayNames2
			displayNames2(()-> name);
		});
		
		//predicate
		// Defined a predicate called data and specified lambda function with condition startsWith
		// it will get values that start with "a"
		Predicate<String> data = (s) -> s.startsWith("a");
		for(String value : employeeNames) {
			// Gets the value in form of true and false and then prints the data if returns true 
			if (data.test(value))
				System.out.println(value);
		}
		
		//Function
		// Defining a function which takes an argument of Integer and returns Double 
		// assigning a lambda function testData and executes after the arrow 
		Function<Integer, Double> functionTest = (testData)->testData/2.0;
		// calls to the apply function in Function 
		System.out.println(functionTest.apply(100));

	}
	// Takes a string and prints it 
	public static void displayNames(String data) {
		System.out.println(data);
	}
	// takes supplier as an argument and uses get method of the supplier and print it 
	public static void displayNames2(Supplier<String> supplier) {
		System.out.println(supplier.get());
	}

}
