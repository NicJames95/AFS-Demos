package demoOOP;

import java.util.HashMap;
import java.util.Map;

public class DevDictionaryMain {

	public static void main(String[] args) 
	{
		DevDictionary devDictionary = new DevDictionary();
		CourseCatalog courseCatalog = new CourseCatalog();
		devDictionary.runApp();
		courseCatalog.printCoursesByTopic(null);
	}

}
