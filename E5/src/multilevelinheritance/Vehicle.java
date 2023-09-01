package multilevelinheritance;

public class Vehicle {
	
	String vehicleno;
	
	Vehicle(){}
	
	Vehicle(String vehicleno)
	{
		this.vehicleno=vehicleno;
	}
	public void detailsVehicle()
	{
		System.out.println("Vehicle no...."+vehicleno);
	}

}
