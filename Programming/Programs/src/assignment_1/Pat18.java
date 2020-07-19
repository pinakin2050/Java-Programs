package assignment_1;

import java.util.Scanner;

public class Pat18 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter N:");
		int n=scan.nextInt();
		for(byte i=0;i<n;i++)
		{
			System.out.print(1);
			if(i<n-1)
				System.out.print(",11,");
				
		}
		scan.close();
	}
}
