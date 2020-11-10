package lab9;

public class CheckingAccount extends BankAccount{
 //fields
	private final static double FEE = .15;
	
	public CheckingAccount(String name, double amount)
	{
		super(name, amount);
		setAccountNumber(getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount)
	{
		amount+=FEE;
		return super.withdraw(amount);
	}
}
