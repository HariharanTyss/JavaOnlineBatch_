package array;

public class Array_Addition {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,40,60,56};
		
		int sum=0;
		//System.out.println(a[0]+a[1]+a[2]+a[3]);
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
			sum=sum+a[i];
			}
		   
		}
		 System.out.println(sum);
	}

}
