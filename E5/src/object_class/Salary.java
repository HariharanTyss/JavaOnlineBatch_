package object_class;

public class Salary {
	
	int sal;
	
	Salary(int sal)
	{
		this.sal=sal;
		
	}
	
	public static void main(String[] args) {
		Salary s1=new Salary(34000);
		System.out.println(s1);
		Salary s2=new Salary(50000);
		System.out.println(s2);
	}
	
	public String toString()
	{
		return ""+sal;
	}

}
