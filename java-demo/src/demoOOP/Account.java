package demoOOP;

public class Account
{
	private int accountId;
	private String accountName;
	private double balance;
	
	public Account()
	{
		
	}
	
	public Account(int acc, String accName, double bal)
	{
		this.accountId = acc;
		this.accountName = accName;
		this.balance = bal;
	}
	
	public int getAccountId()
	{
		return accountId;
	}
	
	public String getAccountName()
	{
		return accountName;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setAccountId(int accountId)
	{
		this.accountId = accountId;
	}
	
	public void setAccountName(String accountName)
	{
		this.accountName = accountName;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}

}
