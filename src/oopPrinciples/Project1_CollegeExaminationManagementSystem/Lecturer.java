package oopPrinciples.Project1_CollegeExaminationManagementSystem;

public class Lecturer  extends User{
	private static int countLecturer=0;
	public Lecturer(){
		++countLecturer;
	}
	
  public Lecturer(String Username,String email){
	  super(++countLecturer,Username,email);
	}
}
