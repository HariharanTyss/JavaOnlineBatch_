package inheritance;

public class Child extends Parent {
	
	int b=20;
	
	public void childMethod()
	{
		System.out.println("from child N S method");
	}
	
	Child()
	{
		System.out.println("Child obj get created");
	}

}
