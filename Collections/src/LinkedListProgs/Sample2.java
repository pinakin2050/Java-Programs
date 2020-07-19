package LinkedListProgs;

import java.util.LinkedList;

public class Sample2 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		System.out.println(ll);
		ll.pop();
		ll.pop();
		System.out.println(ll);
	}
}