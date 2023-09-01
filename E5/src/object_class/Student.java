package object_class;

public class Student {
	
	int rollno;
	int dname;
	String dept;
	String blood;
	public Student(int rollno, int dname, String dept, String blood) {
		super();
		this.rollno = rollno;
		this.dname = dname;
		this.dept = dept;
		this.blood = blood;
	}
	
//	public String toString()
//	{
//		return rollno+" "+dname+" "+dept+" "+blood;
//	}
	public String toString()
	{
		System.out.println(dname);
		System.out.println(rollno);
		System.out.println(dept);
		System.out.println(blood);
		return "";
		
	}
	public static void main(String[] args) {
		Student s1=new Student(1, 2121, "CHEMICAL", "B+");
		System.out.println(s1);
	}
	
	
	

}
