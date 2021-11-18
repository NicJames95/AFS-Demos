package demoOOP;

import java.util.Arrays;

public class ArrayProblem {

	public static void main(String[] args) {
		Product door = new Product(0, "Wooden Door", 35 );
		Product floorPanel = new Product(0, "Floor Panel", 25);
		
		//Create
		Product[] products = {door, floorPanel };
		
		//Print
		// prints memory location, need toString
//		System.out.println(products);
		System.out.println(Arrays.toString(products));
		//Add
	    final Product window = new Product(0, "Window", 15);
	    products = add(window, products);
	    System.out.println(Arrays.toString(products));
		//Duplicate
	    products = add(window, products);
	    System.out.println(Arrays.toString(products));

	}
	
	// Need to create an entire method to add to an array, and even then its just a copy with an added length
	private static Product[] add(Product product, Product[] array) {
		
		int length = array.length;
		Product[] newArray = Arrays.copyOf(array, length + 1);
		newArray[length] = product;
		return newArray;
	}

}
