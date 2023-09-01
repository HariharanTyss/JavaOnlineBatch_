package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class LLL {
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
		ListIterator i = a1.listIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
