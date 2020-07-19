package LinkedLst;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo1 {
	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.add(50);
		ls.add(150);
		ls.add(25);
		ls.add(75);
		ls.add(125);
		ls.add(175);
		ls.add(124);
		System.out.println(ls);
		System.out.println("*******************");
		
		ListIterator ll = ls.listIterator();
		while(ll.hasNext()==true)
		{
			System.out.println(ll.next());
		}
		System.out.println("********************");
		
		ListIterator ll2 = ls.listIterator(ls.size());
		while(ll2.hasPrevious()==true)
		{
			System.out.println(ll2.previous());
		}
		System.out.println("*******************");
		
		Iterator ll1 = ls.descendingIterator();
		while(ll1.hasNext()==true)
		{
			System.out.println(ll1.next());
		}
	}

}
