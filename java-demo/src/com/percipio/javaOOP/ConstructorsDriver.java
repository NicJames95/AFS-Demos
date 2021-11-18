package com.percipio.javaOOP;

public class ConstructorsDriver 
{

	public static void main(String[] args) 
	{
		WashingMachine washingMachine = new WashingMachine("front_loading");
		washingMachine.displayLoadingType();
		
		AutomaticWashingMachine automaticWashingMachine = new AutomaticWashingMachine("top_loading");
		automaticWashingMachine.displayLoadingType();

	}

}
