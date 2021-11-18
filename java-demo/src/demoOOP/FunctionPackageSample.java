package demoOOP;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
//Predicate functional interface has an abstract method of test which gives a boolean value as a result of the specified argument 
public class FunctionPackageSample {

	public static void main(String[] args) {
		// Building a list of values as employeeNames us Arrays.asList 
		List<String> employeeNames = Arrays.asList("alan", "cody", "alax", "blackwell");
		// Using predicate which will work on String data, specified a lambda function called "s" which executes startsWith and passing 'a' 
		// to ensure it identifies names that start with 'a' and returns them 
		Predicate<String> data = (s) -> s.startsWith("a");
		// Iterating over the list employeeNames 
		for (String value: employeeNames) {
		// Making a call to predicate method test if true it will return line 19
			if(data.test(value))
				System.out.println(value);
			// Data tests the lambda expression and returns true or false using the test method
		}

	}

}
