package constructor_chaining;

public class Driver extends UseOfSuperCall{
	int d;
	
	Driver(int d)
	{
		super(10,20,80);
		this.d=d;
	}
	Driver()
	{
		super();
	}
	public static void main(String[] args) {
		Driver d1=new Driver(40);
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1.c);
		System.out.println(d1.d);
		new Driver();
	}
	

}
