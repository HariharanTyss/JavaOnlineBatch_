package variableshadowing;

public class Driver {
	public static void main(String[] args) {
		
		B obj1 = new B();
		System.out.println(obj1.a);
		
		A obj2=new A();
		System.out.println(obj2.a);
	}
		

}
