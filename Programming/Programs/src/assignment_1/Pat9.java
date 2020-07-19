package assignment_1;

import java.util.Scanner;

public class Pat9 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		byte cnt=0,c=0;
		System.out.println("Enter N:");
		byte n=scan.nextByte();
		for(byte i=2;i<=n;i++)
		{	cnt=0;
			for(byte j=1;j<=i;j++)
			{
				if(i%j==0)
					cnt++;
			}
			
			if(cnt==2 )
			{	c++;	
				if(c==1)
					System.out.print(i);
				else
				{
					System.out.print(","+i);
				}
			}
		}
		scan.close();
	}
}
