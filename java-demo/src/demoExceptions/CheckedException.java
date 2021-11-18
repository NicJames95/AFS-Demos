package demoExceptions;

import java.io.File;
import java.io.IOException;

public class CheckedException 
{

	public static void main(String[] args) 
	{
		createFile();

	}
	
	public static void createFile()
	{
		// handle exception lower in the call stack 
		try
		{
		File testF = File.createTempFile("temp", null, new File("/root"));
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}

}
