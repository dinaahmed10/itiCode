package oopPrinciples.Project1_CollegeExaminationManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Lecturer extends User implements LecturerMangeEntity{
	 private static int countLecturer=0;
	 private List<Subject> subjects = new ArrayList<>();
	 private List<Exam> exams = new ArrayList<>();
	public Lecturer(){
		
		++countLecturer;
	}
	
  public Lecturer(String Username,String email){
	  super(++countLecturer,Username,email);
	}
 
  public static int count() {
		return countLecturer;
	}

public List<Subject> getSubjects() {
	return subjects;
}

public void setSubjects(List<Subject> subjects) {
	this.subjects = subjects;
}

@Override
public String toString() {
	return  "Lecturer [id=" + super.getId() + ", Username=" + super.getUsername() + ", email=" + super.getEmail()+ ", Subjects=" + this.getSubjects() + "]";
}
public void addSubject(Subject Subject) {
	this.subjects.add(Subject);
}
public Lecturer LecturerFound(int id,List<Lecturer> Lecturers) {
	for(int i=0;i<Lecturers.size();i++) {
		if(Lecturers.get(i).getId()==id) {
			return Lecturers.get(i);
		}
}
	System.out.println("Lecturer with ID "+id+" not found ");
	return null;
}

@Override
public void addExam(Exam Exam) {
	exams.add(Exam);
	 System.out.println("Added: " + Exam.toString());
	
}

@Override
public void deleteExam(int id) {
	for(int i=0;i<exams.size();i++) {
		if(exams.get(i).getId()==(id)) {
			exams.remove(i);
			System.out.println("Deleted Exam with ID: " + id);
			return;
		}
	}
	System.out.println("Exam not found.");
	
}

@Override
public void updateExam( int id,String examDate) {
	 
	for(int i=0;i<exams.size();i++) {
		if(exams.get(i).getId()==id) {
			exams.get(i).setExamDate(examDate);
			 System.out.println("Updated: " +  exams.get(i).toString());
             return;
		}
	}
	System.out.println("Exam not found.");
	
	
}

@Override
public void listExams() {
	for(int i=0;i<exams.size();i++) {
		 System.out.println(exams.get(i).toString());
	}
	
}

@Override
public void putExamOfSubject(Exam Exam, Subject Subject) {
 
	for(int i=0;i<subjects.size();i++) {
		if(subjects.get(i).getId()==Subject.getId()){ 
				subjects.get(i).addExam(Exam);
				 System.out.println(subjects.get(i).toString());
				 System.out.println("done");
				return;
			
		} 
	}
	System.out.println("Subject not found.");
}
 

@Override
public void putTypeQuestions(int IDExam,String TypeExam) {
	for(int i=0;i<exams.size();i++) {
	if(exams.get(i).getId()==IDExam) {
		exams.get(i).setTypeExam(TypeExam);
		 System.out.println("put Type Questions: " +  exams.get(i).toString());
         return;
	}
}
System.out.println("Exam not found.");
}

}
