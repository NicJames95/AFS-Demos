package com.percipio.javaOOP;

public class WashingMachine
{
	// protected modifiers can be accessed in derived classes as well as classes within the same package
	protected String loadingType = "unknown";
	
	public WashingMachine()
	{
		System.out.println("WashingMachine: default constructor");
	}
	
	public WashingMachine(String loadingType)
	{
		this.loadingType = loadingType;
		System.out.println("WashingMachine: default constructor");
	}
	
	public void displayLoadingType()
	{
		System.out.println("public method displayLoadingType() public string loadingType: " + loadingType);
	}
	
}
