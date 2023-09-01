package inheritance;

public class DemoChild extends DemoParent {
	
	int b=20;
	public static void main(String[] args) {
		DemoChild c1 = new DemoChild();
		System.out.println(c1.b);
		System.out.println(c1.a);
		c1.m1();
	}
	
	public void m1()
	{
		//System.out.println(super);
		System.out.println(super.a);
	}

}
