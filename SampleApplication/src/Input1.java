import java.util.Scanner;
public class Input1 {

	public static void main(String[] args) {
		Scanner scObj=new Scanner(System.in);
		System.out.println("enter values");
		int x=scObj.nextInt();
		int y=scObj.nextInt();
		
		int sum=x+y;
		System.out.println("sum is"+sum);

	}

}
