package multilevelinheritance;

public class Car extends FourWheeler {
	
	String brand;
	Car(){}

	Car(String brand)
	{
		super(4);
		this.brand=brand;
	}
	public void detailsCar()
	{
		System.out.println("Vehicle no..."+vehicleno);
		System.out.println("No of tyres..."+noofTyres);
		System.out.println("Brand name..."+brand);
	}
}
