package interface_;

public class ImplementationClass implements Child {

	@Override
	public void m1() {
		System.out.println("from parent1");
		
	}

	@Override
	public void m2() {
		System.out.println("fromm parent 2");
		
	}

	@Override
	public void m3() {
		System.out.println("from child");
		
	}

}
