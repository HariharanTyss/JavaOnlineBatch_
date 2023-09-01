package inheritance;

public class Parent_Child_Driver {
	
	public static void main(String[] args) {
//		Parent p1=new Parent();
//		p1.parentMethod();
//		System.out.println(p1.a);
//	
		Child c1=new Child();
		System.out.println(c1.a);
		System.out.println(c1.b);
		c1.childMethod();
		c1.parentMethod();
		
		
	}

}
