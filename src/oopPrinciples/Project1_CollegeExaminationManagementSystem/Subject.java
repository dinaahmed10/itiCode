package oopPrinciples.Project1_CollegeExaminationManagementSystem;

import java.util.ArrayList;
import java.util.List;

public   class Subject{
	private int id;
	private String name;
	private String Subjectcode;
	private List<Exam> exams = new ArrayList<>();
	
	private static int countSubject=0;
	public Subject(){
		++countSubject;
		this.id=countSubject;
	}
	
  public Subject(String Username,String Subjectcode){
	  ++countSubject;
	  this.id=countSubject;
	  this.name=Username;
	  this.Subjectcode=Subjectcode;
	}
  
 
  

public static int count() {
		return countSubject;
	}
  
  

  public void addExam(Exam Exam) {
		 exams.add(Exam); 
		System.out.println("Added Subject Exam: " + Exam.toString());
	}

public List<Exam> getExams() {
	return exams;
}

public void setExams(List<Exam> exams) {
	this.exams = exams;
}

public String getCode() {
	return Subjectcode;
}

public void setCode(String code) {
	this.Subjectcode = code;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

 
 
 

@Override
public String toString() {
	return "Subject [id=" + id + ", name=" + name + ", Subjectcode=" + Subjectcode + ", exams=" + this.getExams() + "]";
}

public Subject SubjectFound(int id,List<Subject> Subjects) {
	for(int i=0;i<Subjects.size();i++) {
		if(Subjects.get(i).getId()==id) {
			return Subjects.get(i);
		}
}
	System.out.println("Subject with ID "+id+" not found ");
	return null;
}
}
