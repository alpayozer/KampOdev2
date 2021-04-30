package javaKampOdev;

public class StudentManager extends UserManager{
	
	public void getStudentInformation (Student student) {
		System.out.println("Öðrencinin adý: " + student.getFirstName()+" "+student.getLastName());
		System.out.println("Öðrencinin yaþý: " + student.getAge());
		System.out.println("Öðrencinin cinsiyeti: "+ student.getGender());
		System.out.println("Öðrencinin aldýðý ders: "+ student.getLesson());
		
	}
	
	public void enterTheLesson (Student student) {
		System.out.println(student.getFirstName() + " derse giriþ yaptý.");
	}

}
