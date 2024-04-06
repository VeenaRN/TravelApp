public class BankingApplication {

    public static void main(String[] args) {
        
        Transaction[] transactions = new Transaction[10];

       
        transactions[0] = new Transaction("Ramesh", "Deposit", 1000);
        
        transactions[1] = new Transaction("Murali", "Withdrawal", 500);
        transactions[2] = new Transaction("Reshma", "Transfer", 200);

        
        try {
            Transaction transaction = transactions[7]; 
            System.out.println(transaction.getCustomerName() + " made a transaction of " + transaction.getAmount());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}