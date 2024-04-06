package coms.AbstractFactoryMethod;

public abstract class Loan {
	
	abstract void getInterestRate(double rate);
	double rate;
	
	public void calculateLoanPayment(double loanamt,int years)
	{
		double EMI;
		int n=years*12;
		EMI=(rate*Math.pow(1+rate, n))/(Math.pow((1+rate), n)-1)*loanamt;
		//EMI=(rate*Math.pow(1+rate, n))/(Math.pow((1+rate), n)-1)*loanamt;
		System.out.println("emi is " +EMI);
	
	
	}

}
