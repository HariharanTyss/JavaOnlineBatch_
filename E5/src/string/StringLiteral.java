package string;

public class StringLiteral {
	public static void main(String[] args) {
		String s1="ViJay ganesan";
		
		//find the length of string
		System.out.println(s1.length());
		
		//convert to lower case
		System.out.println(s1.toLowerCase());
		
		//convert to upper case
		System.out.println(s1.toUpperCase());
		
		//used to fetch the particular char
		System.out.println(s1.charAt(8));
		
		//used to compare to strings
		//if same data-->will get 0
		//if different data-->will get random values
		System.out.println(s1.compareTo("ViJay ganesan"));
		
		//used to make sure the member is present or not
		System.out.println(s1.contains("A"));
		
		//usedto check the container is empty or not
		System.out.println(s1.isEmpty());
		
		
		
}

}
