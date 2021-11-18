package demoExceptions;

public class TestArray 
{
	int[] intArray;
	
	public TestArray(int size)
	{
		intArray = new int[size];
	}
	
	public void addElement(int index, int value)
	{
		intArray[index] = value;
	}

}
