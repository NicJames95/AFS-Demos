package demoCollectionsAndMaps;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import demoOOP.Customer;

public class CollectionsOps {

	public static void main(String[] args) {
		Customer obj1 = new Customer("Alex", "regular");
		Customer obj2 = new Customer("Cody", "premium");
		Customer obj3 = new Customer("Gina", "regular");
		Customer obj4 = new Customer("Alan", "premium");
		// Generating stream of objects using .of
		Stream<Customer> streamData = Stream.of(obj1, obj2, obj3, obj4);
		
		//Grouping
		// Grouping will return a map and the map will have key value pair key=String, value=List of Customers 
		// Using streamData stream and calling .collect in order to create the map 
		// within collect we are passing collectors.groupingBy and we are passing to groupingBy lambda expression
		// method reference to getCustomerType 
		Map<String, List<Customer>> map = streamData.collect(Collectors.groupingBy(Customer::getCustomerType));
		// Printing the customers grouped by premium customerType
		System.out.println(map.get("premium"));
		
		//partitionBy
		Stream<Customer> streamData2 = Stream.of(obj1, obj2, obj3, obj4);
		// Key=Boolean value= List of Customers using .collect(Collectors.partitioningBy cust(customer object) 
		Map<Boolean, List<Customer>> map2 = streamData2
		//Executing expression which will get the customerType and compare with "regular" and then store true or false
				.collect(Collectors.partitioningBy(cust -> "regular".equals(cust.getCustomerType())));
		// Display the map 
		// .get(Boolean.TRUE) setting the default condition to true so it will group the "regular" customers
		System.out.println(map2.get(Boolean.TRUE));
	}

}
