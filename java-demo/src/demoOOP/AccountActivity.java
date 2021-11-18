package demoOOP;

public class AccountActivity
{
	public void dispMessage()
	{
		System.out.println("message from dispMessage1");
	}
	// Overloading method
	public void dispMessage(String yourMessage)
	{
		System.out.println(yourMessage);
	}
	
	public void dispMessage(int value)
	{
		System.out.println(value);
	}
	
	public int dispMessage(int value2, int value3)
	{
		return value2 + value3;
	}

}
