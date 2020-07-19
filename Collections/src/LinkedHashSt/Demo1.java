package LinkedHashSt;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(50);
		System.out.println(lhs);
		System.out.println("*******************");
		
		Iterator itr = lhs.iterator();
		while(itr.hasNext()==true)
		{
			System.out.println(itr.next());
		}		
	}
	

}
