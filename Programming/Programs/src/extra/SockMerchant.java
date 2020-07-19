package extra;

import java.util.Scanner;

public class SockMerchant {

	static int index=0;
		static int sockMerchant(int n, int[] ar) {

	        int cnt=1,pair=0;
	        for(int i=0;i<n-1;i++)
	        {
	            for(int j=i+1;j<n;j++)
	            {
	                if(ar[i]>ar[j])
	                {
	                    ar[i]^=ar[j];
	                    ar[j]^=ar[i];
	                    ar[i]^=ar[j];
	                }
	            }
	        }
	        
	        for(int i=0;i<n-1;i++)
	        {   cnt=1;
	            for(int j=i+1;j<n;j++)
	            {
	                if(ar[i]==ar[j])
	                {
	                    cnt++;
	                    i++;
	                } 
	            } 
	            
	            if(cnt>1)
	               pair=pair+(cnt/2);
	        } 
	        return pair;
	    }
	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter total number of socks:");
			int n = scan.nextInt();
	        int[] ar = new int[n];
	        System.out.println("Enter color of socks:");
	        for (int i=0;i<n;i++) {
	           ar[i]=scan.nextInt();
	        }
	        int result = sockMerchant(n, ar);
	        System.out.println("Total Pairs:"+result);
	        scan.close();
		}
}