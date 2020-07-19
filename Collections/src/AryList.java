import java.util.ArrayList;

public class AryList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(23.5f);
		al.add('r');
		al.add("ABC");
		System.out.println(al);
		al.add(1, 100);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.removeAll(al);
		System.out.println(al);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al.contains(30));
		System.out.println(al.contains(200));
		al.clear();
		System.out.println(al);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		ArrayList al2 = new ArrayList();
		System.out.println(al2);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		System.out.println(al.clone());
		System.out.println(al.size());
	}
}