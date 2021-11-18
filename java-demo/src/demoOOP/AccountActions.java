package demoOOP;

public class AccountActions 
{
	private int transactionId;
	private String sourceAccount;
	private String destinationAccount;
	
	public void transferFund()
	{
		transactionId = 1;
		sourceAccount = "12345";
		destinationAccount = "54321";
		System.out.println("fund transferred");
	}

}
