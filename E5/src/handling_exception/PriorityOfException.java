package handling_exception;

public class PriorityOfException {
	
	public static void main(String[] args) {
		try {
		int a=10;
		int b=0;
		int res=a/b;
		System.out.println(res);
		}
		
		
//		catch(ArithmeticException e)
//		{
//			System.out.println("from AE");
//		}
		catch(Throwable e)
		{
			System.out.println("from throwable");
		}
//		catch(Exception e)
//		{
//			System.out.println("from exception");
//		}
	}
}
