package customexception;

public class Employee {
	
	String ename;
	int id;
	double sal;
	public Employee(String ename, int id, double sal) {
		try {
		this.ename = ename;
		this.id = id;
		if(sal<0)
		{
			throw new SalaryException();
		}
		else
		{
			this.sal=sal;
		}
		}
		catch(Exception e)
		{
			System.out.println("sal not be minus");
		}
	}
	
	public void details()
	{
		System.out.println("EMP NAME..."+ename);
		System.out.println("Emp id..."+id);
		System.out.println("emp sal..."+sal);
	}
	

}
