package demoLists;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaPredicateDemo {

	public static void main(String[] args) {
		String[] names = {"Ned", "Fred", "Jessie", "Alice", "Rick"}; // Primitive array
		var myList = new ArrayList<String>(Arrays.asList(names)); // Changing array to ArrayList
		
		myList.replaceAll(s -> s.toUpperCase()); // lambda for each loop that changes the names to uppercase format
		myList.removeIf(s -> s.length() > 4); // lambda if statement that removes names if the length is greater than 4
		myList.forEach(System.out::println); // lambda for each print statement 
		
		// for each loop to change names to uppercase 
//		for(var s: myList) {
//			System.out.print(s.toUpperCase() + "\t");
//			
//		}
//		System.out.println();
//		
//		System.out.println("Afterwards: " + myList);
	    
	}

}
