package demoExceptions;

import java.io.File;
import java.io.IOException;

public class MultipleExceptionDemo 
{

	public static void main(String[] args) 
	{
		try 
		{
			createFile();
		}
		catch (IOException ioe)
		{
			System.out.println(ioe);
		} 
		// catch block for catching if file name is too short(length of at least 3)
		catch (IllegalArgumentException iae)
		{
			System.out.println(iae);
		}
		// exception to catch other exceptions(array out of bounds exception 
		// at the end of createFile() method
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	 } 
		
	public static void createFile() throws IOException 
	{
		//  don't actually have this file on the computer so throws path not found exception
			File testF = new File("/tmp");
			File tempF;
			tempF = File.createTempFile("temp", null, testF);
			System.out.println("Temp filename: " + tempF.getPath());
			int[] myIntArray = new int[5];
			myIntArray[5] = 25;
	}
		
}
