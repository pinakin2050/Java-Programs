package StringProgs;

import java.util.Scanner;

public class StringEqual {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First String:");
		String s1=scan.nextLine();
		System.out.println("Enter Second String:");
		String s2=scan.nextLine();
		compare(s1,s2);
		scan.close();
	}
	
	public static void compare(String s1,String s2)
	{
		int cnt=0;
		if(s1.length()==s2.length())
		{
			for(byte i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					cnt++;
					break;
				}
			}
			if(cnt==1)
				System.out.println("Strings are Unequal!!");
			else
				System.out.println("Strings are equal.");
		}
		else
			System.out.println("Strings are unequal!!");
	}
}
