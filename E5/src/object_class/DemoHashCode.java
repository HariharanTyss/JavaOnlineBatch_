package object_class;

public class DemoHashCode {
	
	int age;
	String name;
	
	public DemoHashCode(int age,String name) {
		this.age=age;
		this.name=name;
	}
	public static void main(String[] args) {
		
		DemoHashCode d1=new DemoHashCode(20,"VIJAY");
		DemoHashCode d2=new DemoHashCode(20,"VIJAY");
//		System.out.println(d1.toString());
		System.out.println(d1.hashCode());
//		
//		System.out.println(d2.toString());
		System.out.println(d2.hashCode());
		System.out.println(d1.equals(d2));
		
	}
	
	public boolean equals(Object o)
	{
		DemoHashCode d1=(DemoHashCode)o;
		return this.age==d1.age && this.name==d1.name;
	}
	public int hashCode()
	{
		return age+name.hashCode();
	}

}
