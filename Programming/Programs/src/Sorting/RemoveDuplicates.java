package Sorting;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=scan.nextLine();
		char ar[]=s.toCharArray();
		
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					ar[i]^=ar[j];
					ar[j]^=ar[i];
					ar[i]^=ar[j];
				}
			}
		}
		s="";
		for(byte i=0;i<ar.length;i++)
		{
			if(ar[i]!=' ')
				s=s+ar[i];
		}
		s=s+'\0'; //or concat last character of array in t. 
		String t="";
		for(int i=0;i<s.length()-1;i++)
		{
			if(!(s.charAt(i)==s.charAt(i+1)))
				t=t+s.charAt(i);
		}
		//t=t+ar[ar.length-1];
		System.out.println(t);
		scan.close();
	}
}
