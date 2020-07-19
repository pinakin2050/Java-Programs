package patterns;
import java.util.Scanner;
public class Pat1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("EMter N:");
		int n = scan.nextInt();
		/*
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 && j<=n/2 || i==n/2 && j<=n/2 || j==0 || j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	*/
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 && j<n/2 && j!=0 || i==n/2 && j<=n/2|| j==0 || j==n/2)
				{
					if(i!=0 && j!=0 || i!=n/2 && j!=n/2 )
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
