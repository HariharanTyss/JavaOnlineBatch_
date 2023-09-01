package constructor_chaining;

public class UseOfThisCall {
	
	UseOfThisCall() {
		this(10);
		System.out.print("*****VIJAY****");
	}
	
	UseOfThisCall(int a) {
		
		this(10,20);
		System.out.print("  NAME IS");
	}

	UseOfThisCall(int a,int b) {
		System.out.print("MY");
		
	}	
	
	public static void main(String[] args) {
		new UseOfThisCall();
		
	}
}
