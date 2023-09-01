package interface_;

interface Demo {
//	//we are not able to create constructor
//	Demo()
//	{
//		
//	}

	//	//we are not able to create an object
	
	
	//we can create main method
	public static void main(String[] args) {
		m1();
			}
	//we can create static method and execute
	public static void m1()
	{
		System.out.println("from static method");
	}
	
	//we are not able to create concreate nsmethod
//	public void m3()
//	{
//		
//	}
	
	//ns methods defaultly consider as abstract
	public void m2();

}
