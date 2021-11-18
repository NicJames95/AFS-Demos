package demoExceptions;

public class PropagatingExceptionsDemo 
{

	public static void main(String[] args) 
	{
		ExceptionGenerator eg = new ExceptionGenerator();
		// MethodFive() causes OutOfBoundsException which goes up the call stack to
		//MethodOne() and finally the main method
		//	execution for commented exception 
		//eg.MethodOne();
		
		// Propagated Exception until caught in main method 
		try
		{
			eg.MethodOne();
		}
		catch(Exception e)
		{
			System.out.println("Caught exception: " + e);
		}

	}

}
