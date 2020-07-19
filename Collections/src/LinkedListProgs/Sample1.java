package LinkedListProgs;

import java.util.LinkedList;

public class Sample1 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
		ll.add(1,15);
		System.out.println(ll);
		ll.addFirst(5);
		ll.addLast(50);
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		ll.offer(60);
		System.out.println(ll);
		ll.offerFirst(1);
		ll.offerLast(61);
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll.poll());
		System.out.println(ll);
		
	}

}
