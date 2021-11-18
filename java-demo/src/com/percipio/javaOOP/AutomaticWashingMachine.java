package com.percipio.javaOOP;

public class AutomaticWashingMachine extends WashingMachine
{
	public int timer = 40;
	
	public AutomaticWashingMachine()
	{
		super();
		System.out.println("AutomaticWashingMachine: default constructor");
	}
	
	public AutomaticWashingMachine(String loadingType)
	{
		super(loadingType);
		System.out.println("AutomaticWashingMachine: loadingType constructor");
	}
	
	public void displayLoadingTypeAndTimer()
	{
		System.out.println("displayLoadingTypeAndTimer() Loading type: " + loadingType);
		System.out.println("displayLoadingTypeAndTimer() Timer: " + timer);
		
		displayLoadingType();
	}

}
