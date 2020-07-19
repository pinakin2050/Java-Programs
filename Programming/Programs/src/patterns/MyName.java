package patterns;

import java.util.Scanner;

public class MyName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N:");
		int n = scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)  //P
			{
				if((j==0 && i>0)|| (i==0 && j<n-1 && j>0) || (j==n-1 && i<n/2 && i>0) || (i==n/2 && j<n-1 && j>0) )
					System.out.print("*");
				else
					System.out.print(" ");
			}			
			for(int j=0;j<3;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<n;j++)  //I
			{
				if(i==0 || i==n-1 || j==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=0;j<3;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<n;j++)	//N
			{
				if(j==0 || i==j || j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=0;j<3;j++)	
			{
				System.out.print(" ");
			}


			for(int j=0;j<n;j++)	//A
			{
				if((j==0 && i>0)|| (i==0 && j<n-1 && j>0) || (j==n-1 && i>0) || i==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=0;j<3;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<n;j++)	//K
			{
				if(j==0 || i+j==n/2 || i-j==n/2 || (i==0 &&j>n/2) || (i==n-1 &&j>n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=0;j<3;j++)
			{
				System.out.print(" ");
			}

			
			for(int j=0;j<n;j++)  //I
			{
				if(i==0 || i==n-1 || j==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=0;j<3;j++)
			{
				System.out.print(" ");
			}

			for(int j=0;j<n;j++)	//N
			{
				if(j==0 || i==j || j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=0;j<3;j++)
			{
				System.out.print(" ");
			}			
		} 
	}
}
