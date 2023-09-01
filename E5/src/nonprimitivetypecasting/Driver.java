package nonprimitivetypecasting;

public class Driver {
	
	public static void main(String[] args) {
//		Child c1 = new Child();
//		System.out.println(c1.a);
//		System.out.println(c1.b);
//		
//		Parent p1=new Parent();
//		System.out.println(p1.a);
		Child c1 = new Child();
		
		Parent p1=c1;//way 1
		
		Parent p2=new Child();//way 2
		System.out.println(p1.a);
		//System.out.println(p1.b);
	}

}
