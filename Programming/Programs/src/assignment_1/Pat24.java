package assignment_1;

import java.util.Scanner;

public class Pat24 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("The series is: 1,2,3,4,5,.....");
		System.out.println("Enter N:");
		int n=scan.nextInt();
		for(byte i=1;i<=n;i++)
		{
			if(i==n)
				System.out.println("The Nth element is:"+i);
		}
		scan.close();
	}
}
