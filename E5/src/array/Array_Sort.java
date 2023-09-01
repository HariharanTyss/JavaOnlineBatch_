package array;

import java.util.Arrays;

public class Array_Sort {
	public static void main(String[] args) {
		int a[]= {34,21,43,56,76,98,89,0,3,0,43};
		
		System.out.println("before arranging...");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		Arrays.sort(a);
		
		System.out.println("after arranging");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("reversr order..");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
