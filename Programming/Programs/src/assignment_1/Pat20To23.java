package assignment_1;

import java.util.Scanner;

public class Pat20To23 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter N:");
		int n=scan.nextInt();
		for(byte i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.print(i);
				if(i<n/2)
					System.out.print(",");
			}
		}
		System.out.println(","+n);
		scan.close();
	}
}
