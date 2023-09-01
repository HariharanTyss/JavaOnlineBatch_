package handling_exception;

public class ExceptionObjectProbagation {
	public static void main(String[] args) {
		result();
	}
	
	
	public static void add()
	{
		int a=10;
		int b=0;
		//always handle the exception at occured place
		try {
		int res=a/b;
		System.out.println(res);
		}catch(Exception e)
		{
			System.out.println("dont pass zero");
		}
	}
	
	public static void result()
	{
		add();
	}

}
