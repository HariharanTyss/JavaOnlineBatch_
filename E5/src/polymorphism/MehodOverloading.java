package polymorphism;

public class MehodOverloading {
	
	public static void main(String[] args) {
		m1(10,20,30);
		
	}
	public static void m1()
	{
		System.out.println("from no args");
	}
	
	public static void m1(int a)
	{
		System.out.println("from int a");
	}
	public static void m1(int a,int b)
	{
		System.out.println("from int a,b");
	}
	public static void m1(int a,int b,int c)
	{
		System.out.println("from int a,b,c");
	}
	

}
