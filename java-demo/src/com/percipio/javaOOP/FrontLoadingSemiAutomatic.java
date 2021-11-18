package com.percipio.javaOOP;

public class FrontLoadingSemiAutomatic extends WashingMachine
{
	public String state = "stopped";
	public int timer = 500;
	
	public void displayStateAndTimer()
	{
		System.out.println("FrontLoadingSemiAutomatic public method displayStateAndTimer()");
		System.out.println("public String state: " + state);
		System.out.println("public int timer: " + timer);
	}

}
