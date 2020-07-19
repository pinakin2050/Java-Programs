package homework;

import java.util.Scanner;

public class RemoveExtraSpace {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s="",t="";
		System.out.println("Enter String:");
		s=scan.nextLine();
		s.trim();
		for(byte i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
				continue;
			else
				t=t+s.charAt(i);
		}
		System.out.println(t);
		scan.close();
	}
}
