package downcasting;

public class Driver {
	public static void main(String[] args) {
//		Parent p1=new Parent();
//		
//		Child c1=(Child)p1;//ClassCastException
//		System.out.println(c1.a);
//		System.out.println(c1.b);
		
		//upcasting
		Child c1=new Child();
		Parent p1=c1;
		//downcast
		Child c2=(Child)p1;
		System.out.println(c2.a);
		System.out.println(c2.b);
		
	}

}
