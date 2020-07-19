package StringProgs;

import java.util.Scanner;

public class VowelToUpperConsToLower {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter String:");
		String s=scan.nextLine();
		String t="";
		for(byte i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
			{
				if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' ||s.charAt(i)=='O' || s.charAt(i)=='U')
				{
					if(s.charAt(i)>=97)
						t=t+(char)(s.charAt(i)-32);
					else
						t=t+s.charAt(i);
				}
				else
				{
					if(s.charAt(i)>=65 && s.charAt(i)<=90)
						t=t+(char)(s.charAt(i)+32);
					else
						t=t+s.charAt(i);
				}
			}
			else
				t=t+s.charAt(i);
		}
		System.out.println(t);
		scan.close();
	}

}
