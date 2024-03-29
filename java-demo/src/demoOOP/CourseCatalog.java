package demoOOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseCatalog {
	
	Map<String, List<Course>> catalog;
	
	public CourseCatalog()
	{
		initializeJavaCourses();
		Map<String, List<Course>> catalog = new HashMap<>();
	}
	
	private void initializeJavaCourses()
	{
		Course spring = new Course("Spring");
		Course maps = new Course("Maps");
		Course lambdas = new Course("Lambdas");
		List<Course> javaCourses = new ArrayList<>(Arrays.asList(spring, maps, lambdas));
		catalog.put("Java", javaCourses);
	}
	
	public void printCoursesByTopic(String topic)
	{
		System.out.println(catalog.get(topic));
	}

}
