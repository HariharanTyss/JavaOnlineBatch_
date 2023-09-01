package array;

public class Length_Array {
	public static void main(String[] args) {
		int a[]= {10,30,40,50,22,56,43,78,778,43,54,67};
		
		System.out.println("before loop...");
		System.out.println(a[0]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		System.out.println(a[6]);
		
		//fetch alll the data in single shot
		System.out.println("after loop....");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
