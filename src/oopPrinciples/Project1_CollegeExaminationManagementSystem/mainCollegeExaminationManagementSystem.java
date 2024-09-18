package oopPrinciples.Project1_CollegeExaminationManagementSystem;

 

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
		Admin.addSubject(new Subject("database1"));
		Admin.addSubject(new Subject("data Structure"));
		Admin.addSubject(new Subject("data minig"));
		Admin.ListOfSubject();
		System.out.println("numOfSubject = "+Subject.count());
		System.out.println("numOfUsers = "+User.count());
		Admin.addSubject(new Subject("data mangement"));
		Admin.updateSubject(3, "database2" );
		Admin.deleteSubject(3);
		Admin.searchSubject(2);
		Admin.searchSubject(3);
		Admin.searchSubject(5);
		Admin.addSubject(new Subject("data seience"));
		Admin.ListOfSubject();
	}
}
