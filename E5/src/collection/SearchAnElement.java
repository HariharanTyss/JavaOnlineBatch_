package collection;

import java.util.ArrayList;

public class SearchAnElement {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add("INDIA");
		a1.add(45.7);
		a1.add("MSD");
		a1.add(100);
		a1.add(10);
		System.out.println(a1);
		
		//use of contains(object)
		System.out.println(a1.contains("INDIA"));
		System.out.println(a1.contains(45.7));
		System.out.println(a1.contains(7));
		System.out.println(a1.contains(a1));
		
		//use of containsAll(collection)
		System.out.println(a1.containsAll(a1));
		
		//use of indexOf(object)
		System.out.println(a1.indexOf(100));
		System.out.println(a1.indexOf(7));
		System.out.println(a1.indexOf("vijay"));
		
	}

}
