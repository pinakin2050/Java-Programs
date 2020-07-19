package StringProgs;

import java.util.Scanner;

public class AddBeforeA {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter String:");
		String s=scan.nextLine();
		String t="";
		for(byte i=0;i<s.length();i++)
		{
			if((s.charAt(i)=='a'||s.charAt(i)=='A'))
				t=t+'*'+s.charAt(i);
			else
				t=t+s.charAt(i);
					
					//OR
			/*
			if((s.charAt(i)=='a'||s.charAt(i)=='A'))
				t=t+'*';
			t=t+s.charAt(i);
			*/
		}
		System.out.println(t);
		scan.close();
	}

}
