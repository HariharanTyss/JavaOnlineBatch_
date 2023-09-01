package object_class;

public class DemoEquals {
	
	int age;
	
	public DemoEquals(int age) {
		this.age=age;
	}
	public static void main(String[] args) {
		DemoEquals d1=new DemoEquals(20);
		DemoEquals d2=new DemoEquals(20);
		
		System.out.println(d1==d2);//it will alwaye compare adress
		System.out.println(d1.equals(d2));//compare data after override
		
	}
	public boolean equals(Object o)
	{
		DemoEquals d1=(DemoEquals) o;
		return this.age==d1.age;
	}

}
