package javaKampOdev;

public class StudentManager extends UserManager{
	
	public void getStudentInformation (Student student) {
		System.out.println("��rencinin ad�: " + student.getFirstName()+" "+student.getLastName());
		System.out.println("��rencinin ya��: " + student.getAge());
		System.out.println("��rencinin cinsiyeti: "+ student.getGender());
		System.out.println("��rencinin ald��� ders: "+ student.getLesson());
		
	}
	
	public void enterTheLesson (Student student) {
		System.out.println(student.getFirstName() + " derse giri� yapt�.");
	}

}
