package patterns;

import java.util.Scanner;

public class Pat6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N:");
		byte n=scan.nextByte();
		
		for(byte i=1;i<=n;i++)
		{
			for(byte j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		for(byte i=0;i<n;i++)
		{
			for(byte j=0;j<n-i;j++)
			{
				System.out.print(n-i);
			}
			System.out.println();
		}
	}

}
