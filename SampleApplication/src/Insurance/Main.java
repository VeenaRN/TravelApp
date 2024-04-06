package Insurance;

public class Main {

	public static void main(String[] args) {
		Vehicle car = new Vehicle("KA 20 EF 2043", "Alto 800", "4 wheeler", 400000d);
		Vehicle auto = new Vehicle("KA 19 FH 6758", "Tvs", "3 wheeler", 200000d);
		Vehicle scooter = new Vehicle("KA 04 LN 8888", "Activa 5g", "2 wheeler", 140000d);
		
		System.out.println(car);
		System.out.println("Maximum loan provided : " + car.issueLoan());
		System.out.println("Insurance amount : " + car.takeInsurance() + "\n");
		
		System.out.println(auto);
		System.out.println("Maximum loan provided : " + auto.issueLoan());
		System.out.println("Insurance amount : " + auto.takeInsurance() + "\n");
		
		System.out.println(scooter);
		System.out.println("Maximum loan provided : " + scooter.issueLoan());
		System.out.println("Insurance amount : " + scooter.takeInsurance() + "\n");
	}
}
