package polymorphism;

public class ConstructorOverloading {
	
	public ConstructorOverloading() {
		System.out.println("welcome");
	}
   ConstructorOverloading(int a) {
	   System.out.println("good morning");
		
	} 
    ConstructorOverloading(int a,int b) {
    	System.out.println("bye");
	
}
    public static void main(String[] args) {
		new ConstructorOverloading(10,20);
	}

}
