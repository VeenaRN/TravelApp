package coms.FactoryMethod;

public abstract class Plan {
	
	protected double rate;
	
	abstract void getRate();
	
	public void CalculateBill(int units)//concrete method
	{
		System.out.println("Total bill\n" +(rate*units));
	}

}
