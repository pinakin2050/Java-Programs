package assignment_1;

import java.util.Scanner;

public class Pat25 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("The series is: 2,4,6,8,10,12,.....");
		System.out.println("Enter N:");
		int n=scan.nextInt();
		int sum=0;
		for(byte i=1;i<=n;i++)
		{
			sum+=2;
			if(i==n)
				System.out.println("The Nth element is:"+sum);
		}
		scan.close();


	}

}
