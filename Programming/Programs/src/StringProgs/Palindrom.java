package StringProgs;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String:");
		String s1=scan.nextLine();
		String s2="";
		byte cnt=0;
		
		for(int i=s1.length()-1;i>=0;i--)
			s2=s2+s1.charAt(i);
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				cnt++;
				break;
			}
		}
		if(cnt==1)
			System.out.println("String is not a palindrom.");
		else
			System.out.println("String is a palindrom.");
		scan.close();
	}
}
