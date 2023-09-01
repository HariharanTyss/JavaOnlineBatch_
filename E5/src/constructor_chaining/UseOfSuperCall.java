package constructor_chaining;

public class UseOfSuperCall {
	
	int a;
	int b;
	int c=a+b;
	
	UseOfSuperCall()
	{
		System.out.println("from no args con");
	}
	UseOfSuperCall(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}

}
