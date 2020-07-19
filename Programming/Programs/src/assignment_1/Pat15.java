package assignment_1;

import java.util.Scanner;

public class Pat15 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter N:");
		int n=scan.nextInt();
		for(byte i=1;i<=n;i++)
		{
			System.out.print(2*i+","+5*i);
			if(i<n)
				System.out.print(",");
		}
		scan.close();
	}
}
