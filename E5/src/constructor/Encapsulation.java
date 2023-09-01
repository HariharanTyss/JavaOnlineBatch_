package constructor;

public class Encapsulation {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price>=0) {
		this.price = price;
		}
		else
		{
			System.out.println("invalid amount");
		}
	}
	
	

}
