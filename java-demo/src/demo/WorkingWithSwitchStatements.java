package demo;

public class WorkingWithSwitchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo_daysInMonth_switch(2,false); // Feb non leap year, 28
		demo_daysInMonth_switch(2,true); // Feb leap year, 29
		demo_daysInMonth_switch(9,false); // Sept non leap year
		demo_daysInMonth_switch(9,true); // Sept leap year
		demo_daysInMonth_switch(-10,false); // Not a valid month

	}
	
	public static void demo_daysInMonth_switch(int month, Boolean isLeapYear) {
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("There are 31 days in the month");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("There are 30 days in the month");
			break;
		case 2:
			System.out.println("There are " + (isLeapYear ? "29" : "28" + " days in the month")); // Ternary statement if isLeapYear = 29 if !isLeapYear = 28
			break;
			default:
				System.out.println("Unkown month");
		}
	}

}
