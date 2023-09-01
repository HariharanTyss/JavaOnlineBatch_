package collection;

import java.util.ArrayList;

public class CRUDOperations {
	public static void main(String[] args) {
		
//		//use of add(object)
//		ArrayList a1=new ArrayList();
//		a1.add(5);
//		a1.add("QSP");
//		a1.add(56.76);
//		System.out.println(a1);
//		
//		//use of addAll(collection ref)
//		ArrayList a2=new ArrayList();
//		a2.addAll(a1);
//		System.out.println(a2);
		
		ArrayList a3=new ArrayList();
		a3.add(30);
		a3.add("msd");
		a3.add(30.45);
		a3.add("virat");
		a3.add(100);
		a3.add(100);
		System.out.println(a3);
		
		//use of add(int index,object)
		a3.add(1, "CSK");
		System.out.println(a3);
		
		//use of add(int index,collection)
		a3.addAll(3, a3);
		System.out.println(a3);
		
	}

}
