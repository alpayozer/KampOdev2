package javaKampOdev;

public class InstructorManager extends UserManager{
	
	public void getInstructorInformation(Instructor instructor) {
		System.out.println("Egitici adý: " + instructor.getFirstName() + " " +instructor.getLastName());
		System.out.println("Egitici yaþý: " + instructor.getAge());
		System.out.println("Eðitici cinsiyeti: "+ instructor.getGender());
		System.out.println("Egiticinin sertifikalarý: " + instructor.getCertificate());
		
	}
	
	public void addNewLesson (Instructor instructor) {
		System.out.println(instructor.getFirstName()+" sisteme yeni ders ekledi.");
	}

}
