package oopPrinciples.Project1_CollegeExaminationManagementSystem;

public class Student  extends User {
	private static int countStudent=0;
	public Student(){
		++countStudent;
	}
	
  public Student(String Username,String email){
	  super(++countStudent,Username,email);
	}

  public static int numOfStudent() {
	return countStudent;
}
  

}
