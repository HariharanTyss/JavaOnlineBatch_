package inheritance_example;

public class FakeDoctor extends Doctor {
	
   String degree;
	
	FakeDoctor(String name,String licenceno,String clinicname,String degree)
	{
		this.degree=degree;
		super.clinicname=clinicname;
		super.licenceno=licenceno;
		super.name=name;
	}
	
	public void detailsFakedoctor()
	{
		System.out.println("Name of Fakedoctor..."+name);
		System.out.println("Licence no of FD..."+licenceno);
		System.out.println("clinic name of FD.."+clinicname);
		System.out.println("degree of FD.."+degree);
		System.out.println("==========================");
	}

}
