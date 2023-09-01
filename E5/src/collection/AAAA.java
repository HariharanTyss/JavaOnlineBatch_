package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AAAA {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(8);
		a1.add("india");
		a1.add(67.7);
		a1.add(78);
		System.out.println(a1);
		ListIterator i=a1.listIterator();
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
		
		
		
	}

}
