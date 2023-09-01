package multilevelinheritance;

public class FourWheeler extends Vehicle {
	
	int noofTyres;
	public FourWheeler() {
		// TODO Auto-generated constructor stub
	}
	
	FourWheeler(int noofTyres)
	{
		super("KA 94 B 7777");
		this.noofTyres=noofTyres;
	}
	public void detailsFourWheeler()
	{
		System.out.println("Vehicle no..."+vehicleno);
		System.out.println("No of tyres..."+noofTyres);
	}

}
