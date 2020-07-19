package firstwayProg1;

import java.util.Scanner;

public class Demo {
	public void disp()
	{
		try
		{
			System.out.println("con 1 established");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter denominator:");
			int b=scan.nextInt();
			System.out.println("Enter numerator:");
			int a=scan.nextInt();
			int c=a/b;
			System.out.println(c);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
		System.out.println("Con 1 terminated.");
	}
}
