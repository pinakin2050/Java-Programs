package patterns;

import java.util.Scanner;

public class Pat4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N:");
		byte n=scan.nextByte();
		int cnt=1, cnt1=(n*n)+1;
		for(byte i=0;i<n;i++)
		{
			if(i!=0)
			{
				for(byte j=0;j<i;j++)
				{
					System.out.print("__");
				}	
			}
			
			for(byte j=0;j<n-i;j++)
			{	
					System.out.print(cnt+++"*");
			}
			
			for(byte j=0;j<n-i;j++)
			{	
				if(j<n-i-1)
					System.out.print(cnt1+j+"*");
				else
					System.out.print(cnt1+j);
			}
			cnt1=cnt1-n+i+1;
			System.out.println();
		}
	}
}
