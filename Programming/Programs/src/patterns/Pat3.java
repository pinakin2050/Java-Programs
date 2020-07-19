package patterns;

import java.util.Scanner;

public class Pat3 {

	public static void main(String[] args) {
		int res;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter N:");
		int n=scan.nextInt();
		int c1=1,c2=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;i>=j;j++)
			{
				if(i%2==0)
				{
					c2=c1+i-1;
					System.out.print(c2--);
				}
				else
				{	c1=c1+c2;
					System.out.print(c1++);
				}
			}
			System.out.println();
		}
	}

}
