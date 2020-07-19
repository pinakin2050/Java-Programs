package homework;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int n1=scan.nextInt();
		System.out.println("Enter Second Number:");
		int n2=scan.nextInt();
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2; 
		
		/*n1=n1*n2;
		n2=n1/n2;
		n1=n1/n2; */
		
		//n2=n1+(n1=n2)-n2;
		
		System.out.println("Numbers after Swapping:");
		System.out.println("N1="+n1+" N2="+n2);
		scan.close();

	}

}
