package demoOOP;

import java.util.Date;

public class CheckPayment extends Payment
{
	String checqueNumber;
	String issuingBank;
	double amount;
	
	public CheckPayment(int paymentId, Date paymentDate, String checqueNumber, String issuingBank, double amount) 
	{
		super(paymentId, paymentDate);
		this.checqueNumber = checqueNumber;
		this.issuingBank = issuingBank;
		this.amount = amount;
	}
	
	public void displayPaymentDetails()
	{
		System.out.println("check payment details... ");
		System.out.println(issuingBank);
	}
	
	

}
