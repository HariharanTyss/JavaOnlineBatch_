package inheritance;

public class CurrentAccount extends Account {
	
	int minimumbal=500;
	
	public void currentAccMethod()
	{
		System.out.println("Current account get created");
		System.out.println(accHolderName);
		System.out.println(accNo);
		System.out.println(branch);
	}

}
