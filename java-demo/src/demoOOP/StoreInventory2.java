package demoOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StoreInventory2 
{

	public static void main(String[] args)
	{
		Set<String> superCycleSet = new TreeSet<>();
		List<String> myStoreList = new ArrayList<>();
		myStoreList.add("Bicycle");
		myStoreList.add("Tricycle");
		myStoreList.add("Scooter");
		myStoreList.forEach(item -> System.out.println("My store item: " + item));
//		// forEach string in myStoreList
//				myStoreList.forEach(items -> {
//					// if string contains "cycle"
//					items.contains("cycle");
//					// add string to superCycleSet
//					superCycleSet.add(items);
//				});
		
		for(String items: myStoreList)
		{
			if(items.contains("cycle"))
			{
				superCycleSet.add(items);
			}
		}
				
				System.out.println(superCycleSet);
				
				

	}

}
