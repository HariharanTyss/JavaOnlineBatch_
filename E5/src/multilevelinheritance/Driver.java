package multilevelinheritance;

public class Driver {
	public static void main(String[] args) {
		//new GrandFather();//i am able to access only GF members
		
		//new Father();//we can access father and GF members
		
		new Son();//we can access all class members
		}

}
