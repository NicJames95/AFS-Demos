package demoOOP;

import java.util.Date;

public abstract class Payment 
{
	int paymentId;
	Date paymentDate;
	public Payment()
	{
		super();
		System.out.println("default constructor is called");
		// TODO Auto-generated constructor stub
	}
	
	public Payment(int paymentId, Date paymentDate)
	{
		super();
		System.out.println("constructor with argument");
		this.paymentId = paymentId;
		this.paymentDate = paymentDate;
	}
	
	public void displayPaymentDetails()
	{
		System.out.println("display of superclass");
	}

	public int getPaymentId()
	{
		return paymentId;
	}

	public void setPaymentId(int paymentId) 
	{
		this.paymentId = paymentId;
	}

	public Date getPaymentDate() 
	{
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate)
	{
		this.paymentDate = paymentDate;
	}
	
	
	

}
