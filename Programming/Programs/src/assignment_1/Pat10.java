package assignment_1;

import java.util.Scanner;

public class Pat10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sum=2,cnt=1;
		System.out.println("Enter N:");
		int n=scan.nextInt();
		System.out.print(2);
		for(byte i=1;i<=n;i++)
		{
			for(byte j=0;j<2;j++)
			{
				if(sum<n)
				{
					sum=sum+cnt;
					System.out.print(","+sum);
				}
				else
					break;
			}
			if(cnt==1)
				cnt=2;
			else
				cnt=1;
		}
		scan.close();
	}
}

