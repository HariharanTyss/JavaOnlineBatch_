package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetBasics {
	public static void main(String[] args) {
		LinkedHashSet l1=new LinkedHashSet();
		l1.add("vijay");
		l1.add("vijay");
		l1.add("msd");
		l1.add(7);
		l1.add(34.6);
		l1.add('A');
		l1.add(8);
		System.out.println(l1);
	}

}
