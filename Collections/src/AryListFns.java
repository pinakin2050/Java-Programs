import java.util.ArrayList;
import java.util.Iterator;

public class AryListFns {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		ArrayList al2 = new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		System.out.println(al2);
		al.retainAll(al2);
		System.out.println(al);
		System.out.println(al.indexOf(30));
		al.addAll(1,al2);
		System.out.println(al);
		System.out.println(al.equals(al2));
		al.ensureCapacity(8);
		System.out.println(al.size());
		System.out.println(al.get(2));
		System.out.println(al.getClass());
		al.set(1,400);
		System.out.println(al);
		System.out.println(al.subList(0,2));
	}
}
