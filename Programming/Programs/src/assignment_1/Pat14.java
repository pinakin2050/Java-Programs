package assignment_1;

import java.util.Scanner;

public class Pat14 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter N:");
		int n=scan.nextInt();
		int a=1,b=1,c=0;
		System.out.print(a+","+"2,"+b+",");
		for(byte i=2;i<=n-1;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(2*i+","+c);
			if(i<n-1)
				System.out.print(",");
		}
		scan.close();
	}
}
