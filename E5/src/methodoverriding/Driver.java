package methodoverriding;

public class Driver {
	public static void main(String[] args) {
	  Card c1=new DebitCard();
	  c1.swipe();
	  
	  Card c2=new CreditCard();
	  c2.swipe();
	
	}

}
