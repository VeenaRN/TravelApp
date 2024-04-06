package coms.AbstractFactoryMethod;

public class FactoryCreator {
	
	public static AbstractFactory getFactory(String ch)
	{
		if(ch.equalsIgnoreCase("Bank"))
			return new BankFactory();
		if(ch.equalsIgnoreCase("Loan"))
			return new LoanFactory();
		
		return null;
		
	}

}
