package com.percipio.javaOOP;

public class InheritanceDriver 
{

	public static void main(String[] args) 
	{
		WashingMachine washingMachine = new WashingMachine("front_loading");
		FrontLoadingAutomatic frontLoadingAutomatic = new FrontLoadingAutomatic();
		FrontLoadingSemiAutomatic frontLoadingSemiAutomatic = new FrontLoadingSemiAutomatic();
		FrontLoadingManual frontLoadingManual = new FrontLoadingManual();
		
		System.out.println("WashingMachine loadingType: " + washingMachine.loadingType);
		System.out.println("FrontLoadingAutomatic loadingType: " + frontLoadingAutomatic.loadingType);
		System.out.println("FrontLoadingSemiAutomatic loadingType: " + frontLoadingSemiAutomatic.loadingType);
		System.out.println("FrontLoadingManual loadingType: " + frontLoadingManual.loadingType);
		
		System.out.println();
		washingMachine.displayLoadingType();
		frontLoadingAutomatic.displayLoadingType();
		frontLoadingSemiAutomatic.displayLoadingType();
		frontLoadingManual.displayLoadingType();
		
		washingMachine.loadingType = "top_loading";
		frontLoadingAutomatic.loadingType = "front_loading_autostop";
		frontLoadingManual.loadingType = "front_loading_manualstop";
		
		System.out.println();
		System.out.println("WashingMachine loadingType (updated): " + washingMachine.loadingType);
		System.out.println("FrontLoadingAutomatic loadingType (updated): " + frontLoadingAutomatic.loadingType);
		System.out.println("FrontLoadingSemiAutomatic loadingType: " + frontLoadingSemiAutomatic.loadingType);
		System.out.println("FrontLoadingManual loadingType (updated): " + frontLoadingManual.loadingType);
		
		System.out.println();
		System.out.println("FrontLoadingAutomatic timer: " + frontLoadingAutomatic.timer);
		System.out.println("FrontLoadingSemiAutomatic timer: " + frontLoadingSemiAutomatic.timer);
		System.out.println("FrontLoadingSemiAutomatic state: " + frontLoadingSemiAutomatic.state);
		System.out.println("FrontLoadingManual state: " + frontLoadingManual.state);
		
		
		
//		//Upcasting washingMachine and Object to derived class FrontLoadingAutomatic 
//		FrontLoadingAutomatic frontLoading = new FrontLoadingAutomatic();
//		WashingMachine washingMachine = new FrontLoadingAutomatic();
//		Object object = new FrontLoadingAutomatic();
//		
//		// True because now the washingMachine and object variables are instantiated as FrontLoadingAutomatic objects
//		System.out.println("washingMachine instanceof FrontLoadingAutomatic: " + (washingMachine instanceof FrontLoadingAutomatic));
//		System.out.println("washingMachine instanceof Object: " + (washingMachine instanceof Object));
//		
//		System.out.println("object instanceof FrontLoadingAutomatic: " + (object instanceof FrontLoadingAutomatic));
//		System.out.println("object instanceof WashingMachine: " + (object instanceof WashingMachine));
//		
//		System.out.println();
//		frontLoading.displayLoadingType();
//		frontLoading.displayTimer();
//		
//		// Java still checks to make sure the washingMachine variable should be casted to FrontLoadingAutomatic object
//		System.out.println();
//		washingMachine.displayLoadingType();
//		((FrontLoadingAutomatic) washingMachine).displayTimer();
//		
//		System.out.println();
//		((WashingMachine) object).displayLoadingType();
//		((FrontLoadingAutomatic) object).displayTimer();
//		
//		System.out.println("FrontLoadingAutomatic instanceof WashingMachine: " + (frontLoading instanceof WashingMachine));
//		System.out.println("FrontLoadingAutomatic instanceof Object: " + (frontLoading instanceof Object));

	}

}
