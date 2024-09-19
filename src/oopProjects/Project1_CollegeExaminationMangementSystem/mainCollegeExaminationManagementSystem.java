package oopProjects.Project1_CollegeExaminationMangementSystem;

 

public class mainCollegeExaminationManagementSystem {
	public static void main(String[] args) { 
		System.out.println("numOfUsers = "+User.count()); 
		Admin Admin=new Admin("ahmed","123ahmed","ahmed.gmail.com");  
		System.out.println( Admin.toString());
		System.out.println(Admin.getPassword());
		Admin.setPassword("ahmedAli12345");
		Admin.setUsername("ahmed ali");
		System.out.println( Admin.toString());
		System.out.println(Admin.getPassword());
		System.out.println("numofAdmin = "+Admin.count());
		Admin.addStudent(new Student("dina ahmed","dina12@gmail.com"));
		Admin.addStudent(new Student("alaa mohamed","alla34@gmail.com"));
		Admin.addStudent(new Student("noura ali","noura12@gmail.com"));
		Admin.addStudent(new Student("farha hassan","farha34@gmail.com"));
		System.out.println(Admin.ListStudents());
		System.out.println("numOfStudent = "+Student.count());
		System.out.println("numOfUsers = "+User.count());
		Admin.deleteStudent(2);
		Admin.updateStudent(3, "noura mohamed", "noura123@gmail.com");
		System.out.println(Admin.ListStudents());
		Admin.searchStudent(3);
		Admin.searchStudent(2);
		Admin.ListOfStudents();
		
		System.out.println("/////////////////////////\n\nLecturer\n\n/////////////////////////");
		Admin.addLecturer(new Lecturer("sara ahmed","dr:sara112@gmail.com"));
		Admin.addLecturer(new Lecturer("ahmed mohmoud","ahmed1112@gmail.com"));
		Admin.addLecturer(new Lecturer("montaser magdy","mm987@gmail.com"));
		Admin.ListOfLecturer();
		System.out.println("numOfStudent = "+Lecturer.count());
		System.out.println("numOfUsers = "+User.count());
		Admin.addLecturer(new Lecturer("manar magdy","mm111@gmail.com"));
		Admin.updateLecturer(3, "mantaser magdr", "montaser123@gmail.com");
		Admin.deleteLecturer(1);
		Admin.searchLecturer(2);
		Admin.searchLecturer(1);
		Admin.searchLecturer(5);
		Admin.addLecturer(new Lecturer("abdo ali","abdoali@gmail.com"));
		Admin.ListOfLecturer();
		System.out.println("/////////////////////////\n\nSubject\n\n/////////////////////////");
		Subject Subject1=new Subject("database1","db120");
		Subject Subject2=new Subject("data Structure","ds54");
		Subject Subject3=new Subject("data minig","dm54");
		Admin.addSubject(Subject1);
		Admin.addSubject(Subject2);
		Admin.addSubject(Subject3);
		Admin.ListOfSubject();
		System.out.println("numOfSubject = "+Subject.count());
		System.out.println("numOfUsers = "+User.count());
		Subject Subject4=new Subject("data mangement","dm4");
		Admin.addSubject(Subject4);
		Admin.updateSubject(3, "database2" );
		Admin.deleteSubject(3);
		Admin.searchSubject(2);
		Admin.searchSubject(3);
		Admin.searchSubject(5);
		Admin.addSubject(new Subject("data seience","ds1987"));
		Admin.ListOfSubject();
		System.out.println("/////////////////////////\n\nassign them for students and lecturers\n\n/////////////////////////");
		Admin.assignSubjectToStudent(3, "database1");
		Admin.assignSubjectToStudent(3, "database");
		Admin.assignSubjectToStudent(7, "database1");
		Admin.assignSubjectToStudent(1, "database1");
		Admin.assignSubjectToStudent(1, "database1");
		Admin.assignSubjectToStudent(1, "data mangement");
		Admin.assignSubjectToStudent(1, "data Structure");
		Admin.ListOfSubject();
		Admin.ListOfStudents();
		System.out.println("/////////////////////////\n");
		Admin.assignSubjectToLecturer(2, "database1");
		Admin.assignSubjectToLecturer(2, "data mangement");
		Admin.assignSubjectToLecturer(3, "database1");
		Admin.assignSubjectToLecturer(4, "data Structure");
		Admin.ListOfSubject();
		Admin.ListOfLecturer();
		System.out.println("\n\n\n/////////////////////////\n\n\n");
		Lecturer Lecturer1=new Lecturer("ali mohsen","ali@gmail.com");
		Admin.addLecturer(Lecturer1);
		Admin.assignSubjectToLecturer(Lecturer1.getId(), "data Structure");
		Admin.assignSubjectToLecturer(Lecturer1.getId(), "database1");
		System.out.println(Lecturer1.toString());
		Exam exam=new Exam("ds1987","9-2-2025","mid-term");
		Exam exam1=new Exam("ds1987","20-7-2025","final-term");
		Lecturer1.addExam(exam);
		Lecturer1.addExam(exam1);
		Lecturer1.listExams();
		Lecturer1.putExamOfSubject(exam,Subject2);
		Lecturer1.putExamOfSubject(exam1,Subject2);
		System.out.println(Lecturer1.toString()); 
		System.out.println(Subject1.toString());
		System.out.println(Subject2.toString());
		Lecturer1.putTypeQuestions(exam.getId(), "true and false");
		Lecturer1.putTypeQuestions(exam1.getId(), "single and multiple choice");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
