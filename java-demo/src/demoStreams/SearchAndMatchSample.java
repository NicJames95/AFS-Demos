package demoStreams;

import java.util.Arrays;
import java.util.List;

public class SearchAndMatchSample {

	public static void main(String[] args) {
		// Creating list using Arrays.asList
		List<Integer> list = Arrays.asList(30, 50, 70, 90, 110);
		// anyMatch
		boolean output2 = list.stream().anyMatch(n
				-> (n * (n +1)) /4 == 5);
		System.out.println("output2="+output2);
		
		//allMatch: Short Circuit Terminal Operation(will not evaluate all elements if one matches)
		
		boolean output3 = list.stream().allMatch(n 
				-> n%2 == 0);
		System.out.println("output3="+output3);
		
		//noneMatch: Short Circuit Terminal Operation
		boolean output4 = list.stream().noneMatch(n 
				-> n<0);
		System.out.println("output4="+output4);

	}

}
