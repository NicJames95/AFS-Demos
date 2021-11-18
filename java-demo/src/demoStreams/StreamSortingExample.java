package demoStreams;

import java.util.ArrayList;
import java.util.Collections;

public class StreamSortingExample {

	public static void main(String[] args) {
		// Creating our dataContainer of type ArrayList
		ArrayList<Integer> dataContainer = new ArrayList<Integer>();
		// populating the dataContainer with data 
		dataContainer.add(105);
		dataContainer.add(112);
		dataContainer.add(95);
		dataContainer.add(375);
		dataContainer.add(303);
		System.out.println("Elements of the dataContainer " + "before sorting : " + dataContainer);
		
		// first argument is the collection which holds the data (dataContainer)
		// second argument is the comparator we use ((o1,o2)) (object1 & object2) instead of comparator
		// Arrow execution is object 1 greater than object 2 then -1 in case if true 
		// else o1 less than o2 results in 1 if true and 0 if false 
		Collections.sort(dataContainer, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		
		System.out.println("Elements of dataContainer after" + " sorting : " + dataContainer);

	}

}
