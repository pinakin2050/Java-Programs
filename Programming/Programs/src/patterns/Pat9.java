package patterns;

import java.util.Scanner;

public class Pat9 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter N:");
      	int n=scan.nextInt();
		int c=1;
		
      	for(byte i=0;i<n;i++)
      	{
      		if(i<n-1)
      		{
	      		for(byte j=0;j<=i;j++)
	            {
					if(j!=i)
	              		System.out.print(c-j+"*");
	              	else
	                  System.out.print(c-j);
	            }
      		}
      		else
      		{
      			for(byte j=0;j<=i;j++)
	            {
					if(j!=i)
	              		System.out.print(c+j+"*");
	              	else
	                  System.out.print(c+j);
	            }
      		}		
      		System.out.println();
      		if(i<n-2)
      			c=c+i+2;
      		else
      			c++;
       } 
	}
}
