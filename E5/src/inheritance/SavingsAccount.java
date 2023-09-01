package inheritance;

public class SavingsAccount extends Account {
	
	int minimumBalance=0;
	
	public void savingsAccMethod()
	{
		System.out.println("saving account get created");
		System.out.println("NAME OF THE ACC HOLDER..."+accHolderName);
		System.out.println("ACC NUMBER IS..."+accNo);
		System.out.println("BRANCH IS..."+branch);
	}

}
