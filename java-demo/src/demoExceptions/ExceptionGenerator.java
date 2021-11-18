package demoExceptions;

public class ExceptionGenerator 
{
	public void MethodOne() throws Exception
	{
		MethodTwo();
	}
	
	public void MethodTwo() throws Exception
	{
		MethodThree();
	}
	
	public void MethodThree() throws Exception
	{
		MethodFour();
		// catches the exception in MethodThree() and stops the program from crashing
//		try
//		{
//		MethodFour();
//		}
//		catch(Exception e)
//		{
//			System.out.println("Caught exception in MethodThree: " + e);
//		}
	}
	
	public void MethodFour() throws Exception
	{
		MethodFive();
	}
	
	public void MethodFive() throws Exception
	{
		throw new Exception("Hello from MethodFive");
		// Exception that is caught in MethodThree
//		int[] myIntArray = new int[5];
//		myIntArray[5] = 25;
	}

}
