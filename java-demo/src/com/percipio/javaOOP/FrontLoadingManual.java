package com.percipio.javaOOP;

public class FrontLoadingManual extends WashingMachine
{
	public String state = "stopped";
	
	public void displayState()
	{
		System.out.println("FrontLoadingManual public method displayState() public String state: " + state);
	}

}
