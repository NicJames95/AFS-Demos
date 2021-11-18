package demoCollectionsAndMaps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import demoOOP.Product;



public class CollectionConcepts
{

	public static void main(String[] args) 
	{
		Product door = new Product(0, "Wooden Door", 35);
		Product floorPanel = new Product(0, "Floor Panel", 25);
		Product window = new Product(0, "Window", 10);
		
		Collection<Product> products = new ArrayList<>();
		products.add(door);
		products.add(floorPanel);
		products.add(window);
		
		final Iterator<Product> productIterator = products.iterator();
		// loops through until there isn't a value
		// can use a for each loop instead 
		while (productIterator.hasNext())
		{
			Product product = productIterator.next();
			if (product.getWeight() > 20)
			{
				System.out.println(product);
			}
			else 
			{
				productIterator.remove();
			}
			
		}
		// If you are looping over a collection with a for loop don't modify it and if you're removing an element use an iterator
		/* Appears like you could use this for loop for the removal however will cause an exception
		 * for (Product product : products)
		 * {
		 *      System.out.println(product);
		 * }
		 * else
		 * {
		 *      products.remove(product) this line causes the error, also clear, and trying to add will cause an error 
		 * }
		 */

		
		// does the same as the productIterator in conjunction with above while loop
		for (Product product : products)
		{
			System.out.println(product);
		}
		
		System.out.println(products.size());
		System.out.println(products.isEmpty());
		System.out.println(products.contains(window));
		System.out.println(products.contains(door));
		
		Collection<Product> otherProducts = new ArrayList<>();
		otherProducts.add(window);
		otherProducts.add(door);
		// takes collection parameter so it removes all in the otherProducts collection which correspond with the products collection
		products.removeAll(otherProducts);
		
		System.out.println(products);
	}

}
