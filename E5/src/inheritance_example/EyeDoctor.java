package inheritance_example;

public class EyeDoctor extends Doctor {
	
	String degree;
	
	EyeDoctor(String name,String licenceno,String clinicname,String degree)
	{
		this.degree=degree;
		super.clinicname=clinicname;
		super.licenceno=licenceno;
		super.name=name;
	}
	
	public void detailsEyedoctor()
	{
		System.out.println("Name of Eyedoctor..."+name);
		System.out.println("Licence no of ED..."+licenceno);
		System.out.println("clinic name of ED.."+clinicname);
		System.out.println("degree of ED.."+degree);
	}
	
	

}
