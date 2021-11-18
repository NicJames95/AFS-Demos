package demoExceptions;

public class Utils 
{
	public String doThat(int val)
	{
		// Converts val into a String of 256/val
		String result = (256/val) + "";
		return result;
	}
	
	public String doThis(String num) throws Exception
	{
		// converts integer represented in a string to an int type 
		int intNum = Integer.parseInt(num);
		// takes the int and calls the doThat method 
		String result = doThat(intNum);
		
		return result;
	}

}
