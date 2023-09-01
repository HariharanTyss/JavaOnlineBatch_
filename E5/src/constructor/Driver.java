package constructor;

public class Driver {
	public static void main(String[] args) {
		Encapsulation obj1 = new Encapsulation();
		System.out.println(obj1.getPrice());
		obj1.setPrice(35000);
		System.out.println(obj1.getPrice());
		}

}
