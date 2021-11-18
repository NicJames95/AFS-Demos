package demoLists;

import java.util.ArrayList;
import java.util.List;

public class UsingLists {

	public static void main(String[] args) {
		List<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("Python");
		languages.add("JavaScript");
		languages.add("Deutsch");
		languages.add("https://pluralsight.com/search?q=java");
		languages.add("https://medium.com/search?q=java");
		languages.add("https://stackoverflow.com/questions/tagged/java");
		languages.add("https://stackoverflow.com/search?q=java+list");
		languages.add("https://reddit.com/r/java");
		languages.add("https://reddit.com/r/javahelp");
		// loop over list and print if the list contains "stackoverflow.com"
		for (String language: languages)
		{
			if(language.contains("stackoverflow.com"))
			{
			System.out.println(language);
			}
			
		}
		System.out.println();
		// .remove
        boolean result = languages.remove("https://medium.com/search?q=java");
        System.out.println(languages + " Removed Medium result: " + result);
        System.out.println(languages);
        System.out.println();
        
        // .sort 
        // sort takes comparator as parameter but defaults with null 
        languages.sort(null);
        System.out.println(languages);
        System.out.println();
        
        // creating subList from the urls section
       List<String> urls =  languages.subList(4, 9);
       // subtracting the urls from the list and creating an int to keep track of what was subtracted
        int remaining = languages.size() - 5;
        System.out.println(remaining);
        System.out.println(urls);
        System.out.println();
       List<String> sprache = languages.subList(0, 4);
       System.out.println(sprache);
       System.out.println();
       System.out.println(languages);
       
		

	}

}
