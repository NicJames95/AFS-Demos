package demo;

public class WorkingWithEnumTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo_getNumDaysInMonth(Month.FEBRUARY, true);

	}
	
	public static void demo_getNumDaysInMonth(Month month, Boolean isLeapYear) {
		
		switch(month) {
		case SEPTEMBER: case APRIL: case JUNE: case NOVEMBER:
			System.out.println("There are 30 days in the month");
			break;
		case JANUARY: case MARCH: case MAY: case JULY: case AUGUST: case OCTOBER: case DECEMBER:
			System.out.println("There are 31 days in the month");
			break;
		case FEBRUARY:
			System.out.println("There are " + (isLeapYear ? "29" : "28") + " days in the month");
			break;
		}
	}

}
