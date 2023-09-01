package dynamicread;
//step 1-->importing
import java.util.Scanner;

public class UseOfScannerClass {
	public static void main(String[] args) {
		//step-->2
		Scanner sc=new Scanner(System.in);
//		System.out.println("ENTER A NUMBER...");
//		int num1=sc.nextInt();
//		System.out.println(num1);
//		
//		System.out.println("ENTER DOUBLE DATA...");
//		double num2=sc.nextDouble();
//		System.out.println(num2);
		
		System.out.println("ENter String...");
		//STEP-->3---USE NON STATIC METHOD
		String s1=sc.nextLine();
		System.out.println(s1);
		
	}

}
