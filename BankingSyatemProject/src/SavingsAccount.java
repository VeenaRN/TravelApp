
public class SavingsAccount extends Account{

	public SavingsAccount(String accountnumber, Customer customer, double balance) {
		super(accountnumber, customer, balance);
		
	}

	@Override
	public void deposit(double amount) {
		balance+=amount;
		
	}

	@Override
	public void withdraw(double amount) {
		
		balance -= amount;
		
	}
	@Override
	public String toString() {
	    return "SavingsAccount{" +
	            "accountNumber='" + getAccountnumber() + '\'' +
	            ", customer=" + getCustomer().getName() +
	            ", balance=" + getBalance() +
	             '}';
	}
}
