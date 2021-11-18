package demoExceptions;

public class UncaughtExceptionDemo {

	public static void main(String[] args) 
	{
		Utils util = new Utils();
		
		try
		{
		String result = util.doThis("8");
		System.out.println(result);
		} 
		// can catch any exception rather than catching 
		//specific type(divide by 0, wrong data type(double, float))
		catch(Exception e)
		{
			// prints what the exception is 
			System.out.println(e);
		}

	}

}
