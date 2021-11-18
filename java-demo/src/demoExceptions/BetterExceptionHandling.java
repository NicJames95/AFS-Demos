package demoExceptions;

import java.io.File;
import java.io.IOException;

public class BetterExceptionHandling
{

	public static void main(String[] args)
	{
		String filepath = "/root/testFile.txt";
		try
		{
			createFile(filepath);
		}
		catch (Exception e)
		{
			// Better information given about what the error is and why
			System.out.println("Create file error! " + filepath);
			System.out.println(e);
			// StackTrace shows where in the code the problem is happening 
			e.printStackTrace();
		}

	}
	
	public static void createFile(String name) throws IOException
	{
		File f = new File(name);
		f.createNewFile();
	}

}
