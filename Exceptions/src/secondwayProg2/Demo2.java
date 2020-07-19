package secondwayProg2;

import java.util.Scanner;

public class Demo2 {
	public void disp()
	{
		try
		{
			System.out.println("con 1 established");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter denominator:");
			int a=scan.nextInt();
			System.out.println("Enter numerator:");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught in disp1");
			throw e;
		}
		finally
		{
			System.out.println("Con 1 terminated.");
		}
	}

}
