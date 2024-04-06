
 class SavingsAccount extends Account implements MaintenanceCharge  {
	public SavingsAccount(String customerName, String accountNumber, double balance) {
        super(accountNumber, customerName, balance);
    }

   
    public float calculateMaintenanceCharge(float noOfYears) {
        float baseCharge = 50; 
        return baseCharge * noOfYears + 50; 
    }
}


