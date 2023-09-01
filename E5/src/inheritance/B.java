package inheritance;

public class B extends A {
	static int b=20;
	
	public static void demoB()
	{
		System.out.println("from class B");
	}
	
	public static void main(String[] args) {
		System.out.println(b);//declared variable
		System.out.println(a);//inherited member
		
		demoB();
		demoA();
	}

}
