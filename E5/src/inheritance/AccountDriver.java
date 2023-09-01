package inheritance;

public class AccountDriver {
	public static void main(String[] args) {
		SavingsAccount s1=new SavingsAccount();
		System.out.println("min balance of saving acc.."+s1.minimumBalance);
		s1.savingsAccMethod();
		
		CurrentAccount c1=new CurrentAccount();
		System.out.println("MINIMUM BAL OF CURRENT ACC..."+c1.minimumbal);
		c1.currentAccMethod();
	}

}
