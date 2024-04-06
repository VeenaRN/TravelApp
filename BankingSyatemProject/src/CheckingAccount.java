
public class CheckingAccount extends Account{
	 public CheckingAccount(String accountnumber, Customer customer, double balance) {
		super(accountnumber, customer, balance);
		// TODO Auto-generated constructor stub
	}
	 
	 

	private double overdraftLimit = 1000;

	

	@Override
	public void deposit(double amount) {
		 balance += amount;
		
	}

	@Override
		 public void withdraw(double amount) {
		        
				if (balance - amount >= -overdraftLimit) {
		            balance -= amount;
		        } else {
		            System.out.println("Withdrawal amount exceeds overdraft limit.");
		        }
		    }

	@Override
	public String toString() {
	    return "CheckingAccount{" +
	            "accountNumber='" + getAccountnumber() + '\'' +
	            ", customer=" + getCustomer().getName() +
	            ", balance=" + getBalance() +
	            ", overdraftLimit=" + overdraftLimit +
	            '}';
	}

	
		
	}


