package collection;

import java.util.HashMap;

public class HashMapBasics {
	public static void main(String[] args) {
		//key and value-->entry
		//no order of insertion
		//key and value will be any datatype
		//key cant be douplicated
		  //it will take latest one
		//value can be douplicated
		//key-->onlu one null
		//value-->multiple null accepted
		HashMap h1=new HashMap();
		h1.put("key1",7);
		h1.put("key2",7);
		h1.put(3,"rohit");
		h1.put(4.0,"virat");
		h1.put(null,null);
		h1.put(null,78);
		h1.put("key1", "msd");
		h1.put("key1", "dhoni");
		h1.put("key1", 7);
		h1.put(7.0,"virat");
		System.out.println(h1);
		
		//to fetch key and value
		System.out.println(h1.entrySet());
		
		//to fetch only key
		System.out.println(h1.keySet());
		
		//to fetch only values
		System.out.println(h1.values());
		
		//to remove the entry
		System.out.println(h1.remove(null));
		System.out.println(h1.remove(4.0));
		System.out.println(h1);
	}

}
