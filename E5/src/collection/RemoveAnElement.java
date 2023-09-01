package collection;

import java.util.ArrayList;

public class RemoveAnElement {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add("INDIA");
		a1.add(45.7);
		a1.add("MSD");
		a1.add(100);
		a1.add(10);
		a1.add(6);
		a1.add("ALIA");
		System.out.println(a1);
		//use of remove(object)
//		Integer aa=100;
//		System.out.println(a1.remove(aa));
//		System.out.println(a1);
		System.out.println(a1.remove("ALIA"));
		System.out.println(a1);
		
		//use of removeAll(collection)
		System.out.println(a1.removeAll(a1));
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.add(45.7);
		a2.add("MSD");
		a2.add(100);
		System.out.println(a2);
		//a2.clear();
		//System.out.println(a2);
		
		//use of remove(int index)
		System.out.println(a2.remove(1));
		System.out.println(a2);
	}

}
