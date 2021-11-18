package demoStreams;
import static java.util.stream.Collectors.toList;
import java.util.Arrays;
import java.util.List;

import demoOOP.Employee;

public class StreamsMapping {
	// Creating List which contains an Employee passing the name and the age 
	static List<Employee> employeeList =
		Arrays.asList(new Employee("Gina", 45),
				new Employee("Cody", 25),
				new Employee("Alex", 65),
				new Employee("blackwell", 15)
				);

	public static void main(String[] args) {
		
		//map Example 
		// Generated the transformed list using map 
	    // first step create the stream using employeeList.stream 
		System.out.println("map----"); // Adding three lines so outputs are seperated
		List<String> mappedList = employeeList.stream().
		// Making call to map method which takes lambda expression emp which is the argument
		// Execution emp.getName() take emp object and return the name
				map(emp -> emp.getName()).
		// Generating another list by using collect and passing toList
		// Now we have transformed employeeList and we have generated another list where 
		// collects responsibility is to create that particular list 
				collect(toList());
		// Method reference approach in order to display what is in mappedList
		// mappedList.forEach passing system.out::println as a method reference
		mappedList.forEach(System.out::println);
		
		//flatmap Example
		// flatmap method will give us capability to flatten a multi-level stream
		// that we get as a result of mapping each element of the input stream to a stream
		// Then we can create a single stream out of the stream of streams
		
		// Creating a CharList stream
		System.out.println("flatmap----"); // Adding three lines so outputs are seperated
		List<String> nameCharList = employeeList.stream()
		// Using .map which gives us name and it splits wherever it finds whitespace
				.map(emp -> emp.getName().split(""))
		// Then we use flatMap which is taking an instance of Function which we specify using lambda expression
		// That lambda expression takes dataarray as input then uses Arrays.stream to create another stream
				.flatMap(dataarray->Arrays.stream(dataarray))
		// We use .map to convert the names to lower case using str as argument and calling str.toLowerCase as expression
				.map(str -> str.toLowerCase())
		// Use .filter which will filter the value depending on the criteria we have given
				.filter(str -> !(str.equals(" ")))
		// Call to .collect to create a List 
				.collect(toList());
		// When we have the list nameCharList we will be iterating in it and passing the name and print the outcome 
		nameCharList.forEach(name -> System.out.print(name));
		
		//peek example 
		// In streams peek is considered an intermediate operation or doesn't end the processing of this stream 
		// Also a non-interfering stream operation, method which guarantees that they will not modify the streams'
		// data source during the execution cycle 
		
		// Taking employeeList and creating a stream with .stream and then we are making call to .peek passing 
		// system.out::println which is lambda expression using method as reference 
		System.out.println("peek----"); // Adding three lines so outputs are seperated
		employeeList.stream().peek(System.out::println);

	}

}
