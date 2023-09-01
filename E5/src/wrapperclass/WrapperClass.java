package wrapperclass;

public class WrapperClass {
	public static void main(String[] args) {
		//boxing
//		int a=10;
//		System.out.println(a);//primitive
//		Integer a1=Integer.valueOf(a);
//		System.out.println(a1.toString());//non primitive
		
		//unboxing
//		long a=20;
//		Long l1=Long.valueOf(a);
//		System.out.println(l1.toString());//non primitive
//		long l2=l1.longValue();
//		System.out.println(l2);//primitive
		
		int a=100;
		Integer a1=a;
		System.out.println(a1.toString());
		int a3=a1;
	//	System.out.println(a3.toString());
	}

}
