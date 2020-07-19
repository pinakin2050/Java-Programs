package StringProgs;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);	
		int cnt=0;
		System.out.println("Enter First String:");
		String s1=scan.nextLine();
		System.out.println("Enter Second String:");
		String s2=scan.nextLine();
		s1.trim();
		s2.trim();
		String t1="",t2="";
		
		for(int i=0;i<s1.length();i++)
		{
			if((s1.charAt(i)>='a' && s1.charAt(i)<='z') || ((s1.charAt(i)>='A' && s1.charAt(i)<='Z')))
			{
				if(s1.charAt(i)>='a')
					t1=t1+s1.charAt(i);
				else
					t1=t1+(char)(s1.charAt(i)+32);
			}
		}
		
		for(int i=0;i<s2.length();i++)
		{
			if((s2.charAt(i)>='a' && s2.charAt(i)<='z') || ((s2.charAt(i)>='A' && s2.charAt(i)<='Z')))
			{
				if(s2.charAt(i)>='a')
					t2=t2+s2.charAt(i);
				else
					t2=t2+(char)(s2.charAt(i)+32);
			}
		}
		

		scan.close();
	}
}
