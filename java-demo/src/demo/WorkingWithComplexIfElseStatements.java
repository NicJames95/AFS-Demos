package demo;

public class WorkingWithComplexIfElseStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo_daysInMonth(2,false); // Feb non leap year, 28
		demo_daysInMonth(2,true); // Feb leap year, 29
		demo_daysInMonth(9,false); // Sept non leap year
		demo_daysInMonth(9,true); // Sept leap year
		demo_daysInMonth(-10,false); // Not a valid month

	}
	
	public static void demo_daysInMonth(int month, Boolean isLeapYear) {
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("There are 31 days in the month");
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("There are 30 days in the month");
		}
		else if(month == 2) {
			if(isLeapYear) {
				System.out.println("There are 29 days in the month");
			}
			else {
				System.out.println("There are 28 days in the month");
			}
		}
		else {
			System.out.println("Unknown month");
		}
	}
}
