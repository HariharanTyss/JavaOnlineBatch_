package exception;

import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {
		
		//HANDLING WHO try&catch
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter num...1");
			int a=sc.nextInt();
			System.out.println("enter num...2");
			int b=sc .nextInt();
			System.out.println(a);
			System.out.println(b);
		    int res=a/b;//exception

		}
		catch(Throwable e)
		{
		System.out.println("DONT USE ZERO");	
		}
		
		
	}

}
