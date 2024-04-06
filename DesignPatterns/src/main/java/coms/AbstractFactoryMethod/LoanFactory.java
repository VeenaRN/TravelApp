package coms.AbstractFactoryMethod;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		if(loan==null)
		return null;
		
		if(loan.equalsIgnoreCase("Home"))
		return new HoamLoan();
		
		if(loan.equalsIgnoreCase("Buisness"))
		return new BuisnessLoan();
		
		return null;
			
	}
}

