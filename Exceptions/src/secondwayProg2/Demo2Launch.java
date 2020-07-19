package secondwayProg2;

import secondwayProg1.Demo1;

public class Demo2Launch {

	public static void main(String[] args) {
		try
		{
			System.out.println("Main con established.");
			Demo2 d=new Demo2();
			d.disp();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled in main.");
		}
		System.out.println("Main con terminated.");
	}
}
