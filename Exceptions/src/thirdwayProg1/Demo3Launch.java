package thirdwayProg1;

import secondwayProg2.Demo2;

public class Demo3Launch {

	public static void main(String[] args) {
		try
		{
			System.out.println("Main con established.");
			Demo3 d=new Demo3();
			d.disp();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled in main.");
		}
		System.out.println("Main con terminated.");
	}
}
