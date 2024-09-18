package oopPrinciples.Project1_CollegeExaminationManagementSystem;

public class Lecturer extends User{
	private static int countLecturer=0;
	public Lecturer(){
		++countLecturer;
	}
	
  public Lecturer(String Username,String email){
	  super(++countLecturer,Username,email);
	}
 
  public static int count() {
		return countLecturer;
	}

@Override
public String toString() {
	return  "Lecturer [id=" + id + ", Username=" + super.getUsername() + ", email=" + super.getEmail() + "]";
}
  
}
