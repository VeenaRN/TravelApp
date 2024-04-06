package Insurance;

public class Vehicle implements Loan, Insurance{
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	
	public Vehicle(String vehicleNumber, String modelName, String vehicleType, double price) {
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType = vehicleType;
		this.price = price;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}
	
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "Vehicle [vehicleNumber=" + vehicleNumber + ", modelName=" + modelName + ", vehicleType=" + vehicleType
				+ ", price=" + price + "]";
	}
	
	@Override
	public double issueLoan() {
		String vehicleType = this.getVehicleType();
		double price = this.getPrice();
		
		if(vehicleType.equals("4 wheeler")) {
			return price * 0.80;
		} else if(vehicleType.equals("3 wheeler")) {
			return price * 0.75;
		} else {
			return price * 0.50;
		}				
	}

	@Override
	public double takeInsurance() {
		double price = this.getPrice();
		
		if(price <= 150000) {
			return 3500;
		} else if(price > 150000 && price <= 300000) {
			return 4000;
		} else {
			return 5000;
		}
	}
}