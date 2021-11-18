package demo;

public class WorkingWithTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo_ifElse(1,2);
		
		demo_ifElse(10,2);
		
		demo_ternaryStatement(1,2);
		demo_ternaryStatement(10,2);

	}
	
	public static void demo_ifElse(int x, int y) {
		int result;
		
		if(x < y) {
			result = x;
		} else {
			result = y;
		}
		System.out.println("Result is: " + result);
	}

	
	public static void demo_ternaryStatement(int x , int y) {
		int result = (x<y) ? x : y;
		System.out.println("Result is: " + result);
		
		//Ternary statement to see if number is even or odd 
		System.out.println("The value of result is: " + (result % 2 == 0 ? "even" : "odd"));
	}
}
