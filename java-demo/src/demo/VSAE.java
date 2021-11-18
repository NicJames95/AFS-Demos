package demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VSAE {

	public static void main(String[] args) {
		String components[] = {"2000", "01", "01"};
		demo_createDate(components);
	}
	
	public static void demo_createDate(String[] components) {
		
		if(components.length >= 3) {
			
			String year = components[0];
			
			String month = components[1];
			
			String day = components[2];
			
			String myDate = year+"-"+month+"-"+day;
			
			LocalDate myLocalDate = LocalDate.parse(myDate);
			
			if(myLocalDate!=null) {
				System.out.println(myLocalDate.format(DateTimeFormatter.ISO_DATE));
			}
			else {
				System.out.println("Cannot create date");
			}
		}
	}

}
