package demoOOP;

import java.util.Date;

public class CardPayment extends Payment 
{
	String cardNumber;
	String cvv;
	double amount;
	
	public CardPayment()
	{
		System.out.println("default card payment constructor");
	}

	public CardPayment(int paymentId, Date paymentDate, String cardNumber, String cvv, double amount) 
	{
		super(paymentId, paymentDate);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.amount = amount;
	}
	
	public void displayPaymentDetails()
	{
		System.out.println("card payment details... ");
		super.displayPaymentDetails();
		System.out.println("subclass method");
		System.out.println(paymentId);
		System.out.println(amount);
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	
	

	
	
	

}
