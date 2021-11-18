package demoOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StoreInventory
{ 
	Set<String> superCycleSet = new TreeSet<>();
	List<String> myStoreList = new ArrayList<>();
	
	public StoreInventory()
	{
		myStoreList.add("Bicycle");
		myStoreList.add("Tricycle");
		myStoreList.add("Scooter");
	}
	
	public void printStoreInventory()
	{
		myStoreList.forEach(item -> System.out.println("My store item: " + item)); 
	}
	
	
	public void collectCycleItems()
	{
		// forEach string in myStoreList
		myStoreList.forEach(item -> {
			// if string contains "cycle"
			item.contains("cycle");
			// add string to superCycleSet
			superCycleSet.add(item);
		});
	}

	

}
