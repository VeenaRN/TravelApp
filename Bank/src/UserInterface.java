
import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();

        System.out.println("Enter the Account number");
        String accountNumber = scanner.next();

        System.out.println("Enter the Customer Name");
        String customerName = scanner.next();

        System.out.println("Enter the Balance amount");
        double balance = scanner.nextDouble();

        System.out.println("Enter the number of years");
        float years = scanner.nextFloat();

        MaintenanceCharge account;
        if (choice == 1) {
            account = new SavingsAccount(customerName, accountNumber, balance);
        } else {
            account = new CurrentAccount(customerName, accountNumber, balance);
        }

        System.out.println("Customer Name " );
        System.out.println("Account Number " );
        System.out.println("Account Balance " );
        System.out.println("Maintenance Charge for " + (choice == 1 ? "Savings" : "Current") + " Account is Rs " + account.calculateMaintenanceCharge(years));

        scanner.close();
    }
}


