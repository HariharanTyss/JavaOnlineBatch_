package collection;

import java.util.ArrayList;

public class RetainMethods {
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
		
		ArrayList a2=new ArrayList();
		a2.add("aa");
		a2.add("bb");
		a2.add("cc");
		a2.addAll(a1);
		System.out.println(a2);
		
		a2.retainAll(a1);
		System.out.println(a2);
	}

}
