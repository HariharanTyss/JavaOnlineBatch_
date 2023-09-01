package earlybinding;

public class Car {//whole object
	
	Engine e1=new Engine();//obj of part of an object
							//in global area
	
	String brand;
	String color;
	
	Car()
	{
		System.out.println("Car object get created");
	}
	
	public void ride()
	{
		System.out.println("Riding is started");
	}

}
