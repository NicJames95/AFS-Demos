package demo;

public class WorkingWithTwoDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo_normalArray();
		demo_2dArray();

	}
	
	public static void demo_normalArray() {
		int normalArr[] = new int[5];
		normalArr[0] = 1;
		normalArr[1] = 2;
		normalArr[2] = 3;
		normalArr[3] = 4;
		normalArr[4] = 5;
		
		for(int n: normalArr) {
			System.out.println(n);
		}
	}
	
	public static void demo_2dArray() {
		
		String twoDArray[][] = new String [5][3];
		
	//Instantiating 5 arrays to be used a sub arrays (of meals for a given weekday)
	String meals_Monday[] = {"apple", "beans" , "cherries"};
	String meals_Tuesday[] = {"carrots", "eggs", "fish"};
	String meals_Wednesday[] = {"coffee", "donut", "pizza"};
	String meals_Thursday[] = {"beef", "potato", "kale"};
	String meals_Friday[] = {"squash", "oranges", "candy"};
	
	//Can set up two Dimensional either this way or
	twoDArray[0] = meals_Monday;
	twoDArray[1] = meals_Tuesday;
	twoDArray[2] = meals_Wednesday;
	twoDArray[3] = meals_Thursday;
	//Setup of two Dimensional array a different way
	twoDArray[4][0] = meals_Friday[0];
	twoDArray[4][1] = meals_Friday[1];
	twoDArray[4][2] = meals_Friday[2];
	
	System.out.println("Weekday Food Chart");
	// Outer loop takes us through each of the 5 days 1by1
	for(int i = 0; i<twoDArray.length; i++) {
		//Prints out which day it is using counter variable adding 1 so the output is 1-5 instead of 0-4
		System.out.print("\tDay " + (i+1) + ":");
		
		//Setup local variable to make current day an array of strings for the inner loop 
		String[] currentDay = twoDArray[i];
		//Loops through the elements of current day 
		for(int j = 0; j<currentDay.length; j++) {
			// Logs the foods in the sub array to the console 
			System.out.print(" " + currentDay[j] + " ");
		}
		System.out.println();
	}
	
	
	}
}
