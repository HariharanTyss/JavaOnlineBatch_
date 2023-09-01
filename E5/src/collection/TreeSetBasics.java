package collection;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetBasics {
	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add(8);
		t1.add(81);
		t1.add(81);
		t1.add(89);
		t1.add(58);
		t1.add(877);
		t1.add(8909);
		//t1.add("vijay");
		System.out.println(t1);
		
		TreeSet t2=new TreeSet();
		t2.add("aeroplane");
		t2.add("dhoni");
		t2.add("india");
		t2.add("doll");
		System.out.println(t2);
		
		HashSet h1=new HashSet();
		h1.add(7);
		h1.add(71);
		h1.add(17);
		h1.add(897);
		System.out.println(h1);
		TreeSet t3=new TreeSet(h1);
		System.out.println(t3);
		
	}

}
