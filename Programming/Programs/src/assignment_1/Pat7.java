package assignment_1;

import java.util.Scanner;

public class Pat7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter N:");
		byte n=scan.nextByte();
		for(byte i=1;i<=n;i++)
		{
			System.out.print(i*6);
			if(i<n)
				System.out.print(",");
		}
		scan.close();
	}
}


