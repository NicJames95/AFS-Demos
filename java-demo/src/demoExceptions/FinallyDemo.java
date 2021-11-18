package demoExceptions;

import java.io.File;
import java.io.IOException;

public class FinallyDemo
{

	public static void main(String[] args)
	{
		String myString = "Started";
		try
		{
			createFile();
			myString = "Completed";
		}
		catch (IOException ioe)
		{
			System.out.println("Caught IOException: " + ioe);
		}
		// finally is executed regardless of any exception found or not
		// in this case "Started" is presented and then the exception is printed in the console
		// exception was not caught because it was IllegalArgument due to the file being named "te"
		finally 
		{
			System.out.println(myString);
		}
		// After changing the name to temp the IOException is caught first
		// Then the finally block is executed(printing myString = "Started")

	}
	
	// Due to not having the specified file, will always cause exception
	// But without any exceptions the file will be created and then 
	// finally block will execute myString = "Completed"
	
	public static void createFile() throws IOException
	{
		File testF = new File("/root");
		File tempF;
		tempF = File.createTempFile("temp", null, testF);
		System.out.println("Temp filename: " + tempF.getPath());
	}

}
