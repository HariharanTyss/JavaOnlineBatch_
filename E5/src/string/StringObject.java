package string;

public class StringObject {
	public static void main(String[] args) {
//		String s1=new String();
//		s1="MS DHONI";
//		System.out.println(s1);
		
//		String s2=new String("VIJAY");
//		System.out.println(s2);
		
		StringBuilder s3=new StringBuilder();
		System.out.println(s3.capacity());
		
		//(previouscapacity+1)*2
		s3.append("qwertyuiopasdfghg");
		System.out.println(s3.capacity());
		
		s3.append("qwertyuiopasdfghju");
		System.out.println(s3.capacity());
		
	}

}
