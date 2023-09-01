package customexception;

public class User {
	
	int age;
	String name;
	
	User(int age,String name) 
	{
		try {
			if(age>=18)
			{
				this.age=age;
				this.name=name;
			}
			else {
				throw new YoungAgeException();
			}
		}catch(Exception e)
		{
			System.out.println("NOT ELIGIBLE");
			System.out.println("AGE MUST BE GREATER THAN 18");
		}
	}
	public String toString()
	{
		return age+"  "+name;
	}

}
