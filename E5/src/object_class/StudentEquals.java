package object_class;

public class StudentEquals {
	int rollno;
	String dname;
	
	public StudentEquals(int rollno,String dname) {
		this.dname=dname;
		this.rollno=rollno;
	}
	
	public static void main(String[] args) {
		
		StudentEquals s1=new StudentEquals(101, "CHEMICAL");
		StudentEquals s2=new StudentEquals(101, "CHEMICAL");
		
		System.out.println(s1.equals(s2));
		
	}
	public boolean equals(Object o)
	{
		StudentEquals s1=(StudentEquals)o;
		return this.rollno==s1.rollno && this.dname==s1.dname;
		
	}

}
