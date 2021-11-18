package demoCollectionsAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;

public class BaseVariationInterfaces {

	public static void main(String[] args) {
		// lambda expression takes argument dayNo and returns the day
		IntFunction<String> getDayOfWeek = dayNo->{
			// Stored the day in HashMap with instance of HashMap 
			Map<Integer,String> days = new HashMap<>();
			// Using put method to put the number and name of the day of the week 
			days.put(1, "Sun");
			days.put(2, "Mon");
			days.put(3, "Tues");
			days.put(4, "Wed");
			days.put(5, "Thurs");
			days.put(6, "Fri");
			days.put(7, "Sat");
			
			if(days.get(dayNo)!=null) {
				return days.get(dayNo);
			} else {
				return "Value Entered must be between 1 and 7";
			}
		};
		
		int input = 1;
		// If input is 1 Calling getDayOfWeek.apply apply method will execute the 
		//lambda expression which contains the map and the logic to return day #
		String day = getDayOfWeek.apply(input);
		System.out.println("day No. "+input+" is : "+day);
		input = 6;
		System.out.println("day No. "+input+" is : "+getDayOfWeek.apply(input));
		input = -2;
		System.out.println("day No. "+input+" is : "+getDayOfWeek.apply(input));
		input = 9;
		System.out.println("day No. "+input+" is : "+getDayOfWeek.apply(input));
        
	}

}
