package object_class;

public class Person {
	
	String name;
	
	Person(String name)
	{
		this.name=name;
	}
	
	public static void main(String[] args) {
		Person p1=new Person("MSD");
		System.out.println(p1);
		System.out.println(p1.toString());
		Person p2=new Person("SRAJAN");
		System.out.println(p2);
	}
	
	//overridden 
	public String toString()
	{
		return name;
	}

}
