package patterns;

import java.util.Scanner;

public class Pat5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N:");
		byte n=scan.nextByte();
		int mul=1,mod,div;
		for(byte i=1;i<=n;i++)
		{
			for(byte j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(byte j=0;j<n-i;j++)
			{
				mul=mul*11;
				
			}
			System.out.println();
		}

	}

}
