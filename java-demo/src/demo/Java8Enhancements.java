package demo;

import java.util.HashMap;
import java.util.Map;

import demoOOP.Product;
import demoOOP.ProductFixtures;

public class Java8Enhancements {

	public static void main(String[] args) 
	{
		final Product defaultProduct = new Product(-1, "Whatever the customer wants", 100);
		
		final Map<Integer, Product> idToProduct = new HashMap<>();
		idToProduct.put(1, ProductFixtures.door);
		idToProduct.put(2, ProductFixtures.floorPanel);
		idToProduct.put(3, ProductFixtures.window);
		
		//Returns null
//		Product result = idToProduct.get(10);
		Product result = idToProduct.getOrDefault(10, defaultProduct);
		System.out.println(result);
		System.out.println(idToProduct.get(10));
		System.out.println();
		
		Product result2 = idToProduct.replace(1, new Product(1, "Big Door", 50));
		System.out.println(result2);
		System.out.println(idToProduct.get(1));
		
		// Replaces all products weights by adding 10 to them 
		idToProduct.replaceAll((id, oldProduct) -> 
		new Product(id, oldProduct.getName(), oldProduct.getWeight() + 10));
		
		System.out.println(idToProduct);
		
		// Produces new value if none is there, if one is there then it will show that value
		Product result3 = idToProduct.computeIfAbsent(10, (id) -> new Product(id, "Custom Product", 10));
		System.out.println(result3);
		System.out.println(idToProduct.get(10));
		
		// Loops over to show every product 
		idToProduct.forEach((key, value) -> 
		{
			System.out.println(key + " -> " + value);
		});

	}

}
