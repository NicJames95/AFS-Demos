package com.percipio.javaOOP;

public class AccessModifiersDriver 
{

	public static void main(String[] args) 
	{
		AutomaticWashingMachine automaticWashingMachine = new AutomaticWashingMachine("top_loading");
		System.out.println("Automatic - loading type: " + automaticWashingMachine.loadingType);
		automaticWashingMachine.displayLoadingType();
		
		System.out.println("Automatic - timer: " + automaticWashingMachine.timer);
		automaticWashingMachine.displayLoadingTypeAndTimer();

	}

}
