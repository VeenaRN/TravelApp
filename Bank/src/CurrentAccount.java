
 class CurrentAccount extends Account implements MaintenanceCharge {
	 
	 public CurrentAccount(String customerName, String accountNumber, double balance) {
	        super(accountNumber, customerName, balance);
	    }

	    
	    public float calculateMaintenanceCharge(float noOfYears) {
	        float baseCharge = 100; 
	        float mcharge=baseCharge * noOfYears + 200;
	        return  mcharge;
	    } 

}
