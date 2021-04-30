package javaKampOdev;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setAge("36");
		instructor1.setGender("Erkek");
		instructor1.setCertificate("MCT,PMP,ITIL");
		
		Student student1 = new Student();
		
		student1.setId(2);
		student1.setFirstName("Alpay");
		student1.setLastName("Özer");
		student1.setAge("19");
		student1.setGender("Erkek");
		student1.setNumber("1516");
		student1.setLesson("Java");
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.getInstructorInformation(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.getStudentInformation(student1);
		
		
		UserManager userManager = new UserManager();
		userManager.signIn(student1);
		userManager.signOut(student1);
		
		userManager.signIn(instructor1);
		userManager.signOut(instructor1);
		
		
		studentManager.enterTheLesson(student1);
		instructorManager.addNewLesson(instructor1);
			
		
	
	}

}
