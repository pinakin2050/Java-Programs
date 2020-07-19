package assignment_1;

import java.util.Scanner;

public class Pat13 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter N:");
		int n=scan.nextInt();
		int a=1,b=1,c=0;
		System.out.print(a+","+b+",");
		for(byte i=0;i<n-2;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c);
			if(i<n-3)
				System.out.print(",");
		}
		scan.close();
	}
}
