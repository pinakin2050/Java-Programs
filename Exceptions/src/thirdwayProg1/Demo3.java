package thirdwayProg1;

import java.util.Scanner;

public class Demo3 {
	public void disp() throws ArithmeticException
	{
		System.out.println("con 1 established");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter denominator:");
		int a=scan.nextInt();
		System.out.println("Enter numerator:");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);	
		System.out.println("Con 1 terminated.");
	}
}	
