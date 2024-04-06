class Transaction {
    private String customerName;
    private String type;
    private double amount;

    public Transaction(String customerName, String type, double amount) {
        this.customerName = customerName;
        this.type = type;
        this.amount = amount;
    }

    // Getters and setters
    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }
}