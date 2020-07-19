package homework;
import java.util.Scanner;
public class StringTypeArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=new String();
		s=scan.nextLine();
		s.trim();
		int cnt=0;
		for(int i=0;i<s.length()-1;i++)	//Counting total words
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
				cnt++;
		}
		String ar[]=new String[cnt+1];
		String t="";
		int j=0;
		for(int i=0;i<s.length();i++)	//String to Array
		{
			if(s.charAt(i)!=' ')
				t=t+s.charAt(i);
			else if(t!="")
			{
				ar[j]=t;
				j++;
				t="";
			}
		}
		ar[j]=t;
		for(int i=0;i<ar.length;i++)	//word by word reversal
		{
			s=ar[i];
			for(int k=s.length()-1;k>=0;k--)
			{
				System.out.print(s.charAt(k));
			}System.out.print(" ");
		}
		System.out.println();
		
		for(int i=ar.length-1;i>=0;i--)	//reversal
		{
			System.out.print(ar[i]);
			if(i!=0)
				System.out.print(" ");
		}
		System.out.println();
		for(int i=ar.length-1;i>=0;i--)//reversal with word size
		{
			System.out.print(ar[i]+ar[i].length());
			if(i!=0)
				System.out.print(" ");
		}
		scan.close();
	}
}