package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class BBB {
	public static void main(String[] args) {
		LinkedList a1=new LinkedList();
		a1.add(8);
		a1.add("india");
		a1.add(67.7);
		a1.add(78);
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
		
	}

}
