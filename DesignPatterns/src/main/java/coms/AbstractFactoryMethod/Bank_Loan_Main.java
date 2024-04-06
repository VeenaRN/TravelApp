package coms.AbstractFactoryMethod;
import java.io.*;
public class Bank_Loan_Main {

	public static void main(String[] args) throws Exception {
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter name of the bank for loan");
		String bank=br.readLine();
		
		System.out.println("enter loan type");
		String loanName=br.readLine();
		
		AbstractFactory bankFactory=FactoryCreator.getFactory("Bank");
		Bank b=bankFactory.getBank(bank);
		
		System.out.println("Bank name "+b.getBankName());
		System.out.println("enter rate of interest for that: "+b.getBankName());	
		
		double rate=Double.parseDouble(br.readLine());
		
		System.out.println("enter loan amount");
		int amt=Integer.parseInt(br.readLine());
		
		System.out.println("enter duration");
		int years=Integer.parseInt(br.readLine());
		
		AbstractFactory loanfact=FactoryCreator.getFactory("Loan");
		Loan loan=loanfact.getLoan(loanName);
		
		loan.getInterestRate(rate);
		
		loan.calculateLoanPayment(amt, years);
		

	}

}
