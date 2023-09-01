package constructor;

public class User {
	String name;
	int age;
	String email;
	long phno;
	
	User()
	{
		System.out.println("Invalid credentials");
	}
	User(String name)
	{
		this.name=name;
		System.out.println("Registered with only name");
	}
	User(String name, int age) {
		System.out.println("Registered with name,age");
		this.name = name;
		this.age = age;
	}
    User(String name, int age, String email) {
		System.out.println("Registered with name,age and email");
		this.name = name;
		this.age = age;
		this.email = email;
	}
	 User(String name, int age, String email, long phno) {
		System.out.println("Registered with all details");
		this.name = name;
		this.age = age;
		this.email = email;
		this.phno = phno;
	}
	 public void details()
	 {
		 System.out.println(name);
		 System.out.println(age);
		 System.out.println(email);
		 System.out.println(phno);
	 }
    
	

}
