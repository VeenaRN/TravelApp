
public class BankingSystem {
	
	public static void main(String[] args) {
		Customer customer1 = new Customer("John Doe", "123 Main St");
        Customer customer2 = new Customer("Jane Smith", "456 Elm St");
        
        Account account1 = new SavingsAccount("S123", customer1, 10);
        Account account2 = new CheckingAccount("C456",customer2, 20);
        
        account1.deposit(0);
        account2.withdraw(3000);
        
        System.out.println(account1);
        System.out.println(account2);
	}
        
}
