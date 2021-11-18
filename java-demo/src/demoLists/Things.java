package demoLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Things {
	List<String> contents;
	
	// changes List to an ArrayList
	public Things(String[] stuff) {
		contents = new ArrayList<>(Arrays.asList(stuff));
	}
	
	public String toString() {
		var sb = new StringBuilder();
		for(var thing : contents) {
			sb.append(thing);
			sb.append("\t");
		}
		return sb.toString();
	}
}
