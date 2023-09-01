package dynamicread;

import java.util.Scanner;

public class UserDetails {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name");
		String fn=sc.nextLine();
		System.out.println("enter last name");
		String ln=sc.nextLine();
		System.out.println("enter degree");
		String degree=sc.nextLine();
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("enter salary");
		double sal=sc.nextDouble();
		
		System.out.println(fn);
		System.out.println(ln);
		System.out.println(age);
		System.out.println(degree);
		System.out.println(sal);
	}

}
