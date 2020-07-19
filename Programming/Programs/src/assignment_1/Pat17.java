package assignment_1;

import java.util.Scanner;

public class Pat17 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter N:");
		int n=scan.nextInt();
		int sum=1;
		System.out.print("1,");
		for(byte i=1;i<n;i++)
		{
			sum=sum+4;
			System.out.print(sum);
			if(i<n-1)
				System.out.print(",");
		}
		scan.close();
	}
}
