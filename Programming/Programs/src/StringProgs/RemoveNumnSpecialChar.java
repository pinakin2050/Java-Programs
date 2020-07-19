package StringProgs;

import java.util.Scanner;

public class RemoveNumnSpecialChar {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter String:");
		String s=scan.nextLine();
		String t="";
		s.trim();
		for(byte i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
				t=t+s.charAt(i);
		}
		System.out.println(t);
		scan.close();
	}
}
