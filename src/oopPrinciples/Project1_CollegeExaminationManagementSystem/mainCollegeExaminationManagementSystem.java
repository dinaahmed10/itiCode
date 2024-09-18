package oopPrinciples.Project1_CollegeExaminationManagementSystem;

 

public class mainCollegeExaminationManagementSystem {
	public static void main(String[] args) {
		 
		
		  
		System.out.println("numOfUsers = "+User.numOfUsers());
		
		Admin Admin=new Admin("ahmed","123ahmed","ahmed.gmail.com"); 
		System.out.println( Admin.toString());
		System.out.println(Admin.getPassword());
		Admin.setPassword("ahmedAli12345");
		Admin.setUsername("ahmed ali");
		System.out.println( Admin.toString());
		System.out.println(Admin.getPassword());
		System.out.println("numofAdmin = "+Admin.numofAdmin());
		Admin.addStudent(new Student("dina ahmed","dina12@gmail.com"));
		Admin.addStudent(new Student("alaa mohamed","alla34@gmail.com"));
		Admin.addStudent(new Student("noura ali","noura12@gmail.com"));
		Admin.addStudent(new Student("farha hassan","farha34@gmail.com"));
		System.out.println(Admin.ListStudents());
		System.out.println("numOfStudent = "+Student.numOfStudent());
		System.out.println("numOfUsers = "+User.numOfUsers());
		Admin.deleteStudent(2);
		Admin.updateStudent(3, "noura mohamed", "noura123@gmail.com");
		System.out.println(Admin.ListStudents());
		Admin.searchStudent(3);
		Admin.searchStudent(2);
		Admin.ListOfStudents();
		
		
	}
}
