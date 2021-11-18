package demoOOP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DevDictionary {

	
	private Map<String, String> dictionary;
	private Map<String, String> dictionary2;
	
	public DevDictionary()
	{
		Map<String, String> dictionary2 = new TreeMap<>();
		Map<String, String> dictionary = new HashMap<>();
		// Adding values to the HashMap keys on the left of comma and values on the right
		dictionary.put("SEO", "Search engine optimization");
		dictionary.put("SaaS", "Software as a service");
		dictionary.put("UX", "User experience");
		dictionary2.put("SEO", "Search engine optimization");
		dictionary2.put("SaaS", "Software as a service");
		dictionary2.put("UX", "User experience");
	}
	
	
	// Iterating over treeMap
	public void print()
	{
		for(Map.Entry<String, String> entry: dictionary2.entrySet())
		{
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
	
	public void runApp()
	{
		Scanner scanner = new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("Enter lookup word or Q to quit");
			String input = scanner.nextLine();
			if(input.toUpperCase().equals("Q"))
			{
				System.out.println("Thanks for using Dev Dictionary");
				return;
			}
			
			if(!dictionary.containsKey(input))
			{
				System.out.println("Word doesn't exist, try again or Q to quit");
			} 
				else
				{
					dictionary.get(input);
					System.out.println(input + ": " + dictionary.get(input));
				}
		}
		
	}

}

