package inheritance_example;

public class DoctorDriver {
	
	public static void main(String[] args) {
		EyeDoctor e1=new EyeDoctor("VICKY", "EYE2345", "SHREE CLINIC", "MBBS-EYE SL");
		e1.detailsEyedoctor();
		
		EyeDoctor e2=new EyeDoctor("Vijay", "EYE4567", "AIIMS", "MBBS-EYE SL");
		e2.detailsEyedoctor();
		
		FakeDoctor f1=new FakeDoctor("HELLO", "EHN3456", "GOVERMENT", "BE");
		f1.detailsFakedoctor();
		
	
	}
	
}
