package abstraction;

abstract class Demo {
	
	//we can create constructor
	Demo()
	{
		
	}
	//we are able to create concreate method
	public void m1()
	{
		
	}
	
	//we can create ab.method
	abstract public void m2();
	
	//we can create main method
	public static void main(String[] args) {
		//we are not able to create object
	//	new Demo();
		//we can execute static method
		m3();
		
	}
	//we are able to create static method
	public static void m3()
	{
		System.out.println("from static method");
	}
	
	

}
