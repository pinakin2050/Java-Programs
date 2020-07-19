package secondwayProg1;

import firstwayProg1.Demo;

public class Demo1Launch {

	public static void main(String[] args) {
		try
		{
			System.out.println("Main con established.");
			Demo1 d=new Demo1();
			d.disp();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Eception handled in main.");
		}
		System.out.println("Main con terminated.");

	}

}
