package oopProjects.Project1_CollegeExaminationMangementSystem;

import java.util.ArrayList;
import java.util.List;

public   class Student  extends Person {
	private static int countStudent=0;
	 private List<Subject> Subjects = new ArrayList<>();
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
	return "Student [id=" + super.getId() + ", Username=" + super.getUsername() + ", email=" + super.getEmail() + ", Subjects=" + this.getSubjects() + "]";
}

public List<Subject> getSubjects() {
	return Subjects;
}

public void setSubjects(List<Subject> subjects) {
	Subjects = subjects;
}
public void addSubject(Subject Subject) {
	this.Subjects.add(Subject);
}
public Student StudentFound(int id,List<Student> Students) {
	for(int i=0;i<Students.size();i++) {
		if(Students.get(i).getId()==id) {
			return Students.get(i);
		}
}
	System.out.println("Student with ID "+id+" not found ");
	return null;
}
}
