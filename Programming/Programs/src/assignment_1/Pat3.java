package assignment_1;

import java.util.Scanner;

public class Pat3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N:");
		byte n=scan.nextByte();
		
		for(byte i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				if(i<n)
					System.out.print(i+",");
				else
					System.out.print(i);
			}
		}
		scan.close();
	}
}
