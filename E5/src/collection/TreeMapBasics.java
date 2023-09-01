package collection;

import java.util.TreeMap;

public class TreeMapBasics {
	
	//not follows order of insertion
	//defaultly sorting the elements
	//key cannot be duplicated
	//value can be duplicated
	//key-->should not be null-->null pointer excep
	//value-->null accepted
	//key-->should be comparable-->class cast excep
	public static void main(String[] args) {
		TreeMap t1=new TreeMap();
		t1.put(7, "msd");
		t1.put(78, "msd");
		t1.put(18, null);
		t1.put(10, "sachin");
		t1.put(13, "faf");
		t1.put(45, "rohit");
		t1.put(45, "rohit");
		System.out.println(t1);
		
		//to fetch entry
		System.out.println(t1.entrySet());
		//only key
		System.out.println(t1.keySet());
		//only values
		System.out.println(t1.values());
		System.out.println(t1.get(7));;

	}

}
