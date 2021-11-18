package demoOOP;

import java.util.Date;

import demoOOP.Account;
import demoOOP.AccountActivity;

public class Driver 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Account obj = new Account();
		obj.setAccountId(100);
		obj.setAccountName("alex");
		obj.setBalance(4000);
		System.out.println(obj.getAccountId());
		
		Account obj2 = new Account(101, "crozier", 5000);
		System.out.println(obj2.getAccountId());
		AccountActivity obj3 = new AccountActivity();
		obj3.dispMessage();
		obj3.dispMessage("secondMessage");
		obj3.dispMessage(100);
		// Static methods and variables called without creating instance of class 
		System.out.println(CustomerActions.counter);
		CustomerActions.dispCounter();
		
		// Calling constructor with super class fields as well 
		Payment cardPayment = new CardPayment(1, new Date(), "2345678900", "248", 2463.89);
		cardPayment.displayPaymentDetails();
		// Cannot access getCardNumber() without casting to CardPayment because of cardPayment instance
		// is of the superclass Payment 
		System.out.println(((CardPayment) cardPayment).getCardNumber());
		Payment checkPayment = new CheckPayment(2, new Date(), "2345", "BOA", 5000.00);
		checkPayment.displayPaymentDetails();
		
		

	}

}
