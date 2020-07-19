package patterns;

import java.util.Scanner;

public class Pat7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N:");
		byte n=scan.nextByte();
		int c=n+2;
		for(byte i=0;i<n;i++)
		{
			for(byte j=0;j<=i;j++)
			{
				System.out.print(c);
			}
			c++;
			System.out.println();
		}
		c--;
		for(byte i=0;i<n;i++)
		{
			for(byte j=0;j<n-i;j++)
			{
				System.out.print(c);
			}
			System.out.println();
			c--;
		}
		System.out.println();
	}

}
