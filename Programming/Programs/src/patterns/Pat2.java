package patterns;

import java.util.Scanner;

public class Pat2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N:");
		int n = scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			} 
			
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1 || j==0 || j==n-1 || i==j || i+j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			
			for(int j=0;j<=n-1;j++)
			{
				if(j==0||i==n-1||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			for(int j=0;j<n;j++)
			{
				if(j==n-1||i==n-1||i+j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1 || j==0 || j==n-1 || i==j || i+j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			for(int j=0;j<n;j++)
			{
				if(i>=j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			
			System.out.println();
		}

	}

}
