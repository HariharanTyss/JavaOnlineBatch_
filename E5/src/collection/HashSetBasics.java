package collection;

import java.util.HashSet;

public class HashSetBasics {
	public static void main(String[] args) {
		//wont follow order of insertion
		//no douplicate
		//no indexing
		HashSet h1=new HashSet();
		h1.add("msd");
		h1.add(7);
		h1.add(7);
		h1.add("vijay");
		h1.add(71);
		h1.add(90);
		h1.add(70.56);
		h1.add('A');
		h1.add('A');
		System.out.println(h1);
		
		HashSet h2=new HashSet();
		h2.addAll(h1);
		h2.add("from h2");
		h2.add(70.56);
		System.out.println(h2);
		
		for(Object i:h2)
		{
			System.out.println(i);
		}
	}

}
