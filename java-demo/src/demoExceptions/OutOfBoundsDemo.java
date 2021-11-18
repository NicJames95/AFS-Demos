package demoExceptions;

public class OutOfBoundsDemo
{

	public static void main(String[] args)
	{
		TestArray myTestArray = new TestArray(5);
		// outOfBounds trying to add to index 5 instead of 4 
		myTestArray.addElement(5, 23);
		

	}

}
