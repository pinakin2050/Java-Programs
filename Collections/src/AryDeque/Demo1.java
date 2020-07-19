package AryDeque;

import java.util.ArrayDeque;

public class Demo1 {

	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		System.out.println(ad);
		ad.addFirst(40);
		System.out.println(ad);
		ad.addLast(50);
		System.out.println(ad);
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		System.out.println(ad.pollFirst());
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad.hashCode());
	}
	
}
