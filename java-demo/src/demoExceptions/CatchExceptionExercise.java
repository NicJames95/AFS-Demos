package demoExceptions;

public class CatchExceptionExercise 
{

	public static void main(String[] args) 
	{
		try
		{
		CatchMe catchMe = new CatchMe();
		} 
		catch(Exception e)
		{
			System.out.println(e + "\n Caught!");
		}

	}

}
