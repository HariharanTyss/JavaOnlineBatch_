package lazybinding;

public class Car {
	
	Car()
	{
		System.out.println("CAR OBJ GET CREATED");
	}
	
	public void useIndicator()
	{
		Indicator i1=new Indicator();
		System.out.println("i am from useIndicator");
	}

}
