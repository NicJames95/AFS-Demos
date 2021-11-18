package demo;

public class WorkingWithDebugging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String andy = getUserById(0);
//		System.out.println(andy);
//		
//		String nelle = getUserById(10);
//		System.out.println(nelle);
		
		demo_performCalculations(4,0);

	}
	
	public static String getUserById(int id) {
		String users[] = {"Andy", "Elle", "April", "Nelle"};
//		return users[id];
		
		// ternary statement to check if id is greater than 0 and less than the length 
		//of the array if yes return the id if not return null 
		return (id >= 0 && id < users.length) ? users[id] : null;
	}
    
	public static void demo_performCalculations(double value1 , double value2) {
		
		double sum = Calculator.add(value1, value2);
		System.out.println("Sum is: " + sum);
		
		double difference = Calculator.subtract(value1, value2);
		System.out.println("Difference is: " + difference);
		
		double product = Calculator.multiply(value1, value2);
		System.out.println("Product is: " +  product);
		
		double result = Calculator.divide(value1, value2);
		System.out.println("Result of division is: " + result);
	}
}

   
