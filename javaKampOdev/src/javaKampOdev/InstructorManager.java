package javaKampOdev;

public class InstructorManager extends UserManager{
	
	public void getInstructorInformation(Instructor instructor) {
		System.out.println("Egitici ad�: " + instructor.getFirstName() + " " +instructor.getLastName());
		System.out.println("Egitici ya��: " + instructor.getAge());
		System.out.println("E�itici cinsiyeti: "+ instructor.getGender());
		System.out.println("Egiticinin sertifikalar�: " + instructor.getCertificate());
		
	}
	
	public void addNewLesson (Instructor instructor) {
		System.out.println(instructor.getFirstName()+" sisteme yeni ders ekledi.");
	}

}
