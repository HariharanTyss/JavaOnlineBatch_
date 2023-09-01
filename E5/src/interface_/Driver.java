package interface_;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("TYPE 1 FOR DEBIT CARD");
		System.out.println("TYPE 2 FOR CREDIT CARD");
		int option=sc.nextInt();
		
		if(option==1)
		{
			Card c1=new DebitCard();
			c1.swipe();
		}
		else if(option==2)
		{
			Card c1=new CreditCard();
			c1.swipe();
		}
		int []a= {10,20,30,40};
		System.out.println(a);
		 int []b=a.clone();
		 System.out.println(b);
	}
	

}
