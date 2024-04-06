package coms.FactoryMethod;
import java.io.*;
//import java.util.Scanner;
public class BillApp {
	
	public static void main(String[] args) throws IOException {
	
			PlanFactory pfact=new PlanFactory();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			//Scanner sc=new Scanner(System.in);
			
			System.out.println("enter plan type(D/I/C)");
			String ptype=br.readLine();
			
			System.out.println("enter units");
			int units =Integer.parseInt(br.readLine());
			
			Plan p=pfact.getPlan(ptype);
			
			p.getRate();
			p.CalculateBill(units);
			
			
			
			
		
		
	}

}
