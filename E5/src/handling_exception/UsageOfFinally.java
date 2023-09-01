package handling_exception;

public class UsageOfFinally {
	public static void main(String[] args) {
		
		try {
		int a=10;
		int b=0;
		int res=a/b;
		System.out.println(res);
		}
		finally {
			System.out.println("Thank you for usage");
		}
//		catch(Exception e)
//		{
//			
//		}
		
	}

}
