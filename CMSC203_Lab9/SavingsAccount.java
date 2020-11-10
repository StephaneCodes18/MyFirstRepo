package lab9;

public class SavingsAccount extends BankAccount{
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double balance) 
	{
		super(name, balance);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest() 
	{
		deposit((rate/12.0) * getBalance());
	}
	
	@Override
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public SavingsAccount(SavingsAccount s, double balance)
	{
		super(s, balance);
		savingsNumber = s.savingsNumber+1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		
		
	}
}
