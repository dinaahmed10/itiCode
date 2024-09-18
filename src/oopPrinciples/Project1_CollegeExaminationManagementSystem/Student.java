package oopPrinciples.Project1_CollegeExaminationManagementSystem;

public   class Student  extends User {
	private static int countStudent=0;
	public Student(){
		++countStudent;
	}
	
  public Student(String Username,String email){
	  super(++countStudent,Username,email);
	}
//override 
   public static int count() { 
		return countStudent;
	}

@Override
public String toString() {
	return "Student [id=" + id + ", Username=" + super.getUsername() + ", email=" + super.getEmail() + "]";
}

 
 
 

 
  

}
