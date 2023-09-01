package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateElements {
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
//		Iterator i = a1.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
		for(Object o:a1)
		{
			System.out.println(o);
		}
	
		
	}

}
