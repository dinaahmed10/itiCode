package oopPrinciples.Project1_CollegeExaminationManagementSystem;

import java.util.List;

public interface AdminMangeEntities {


	public List<Student> ListStudents();
	public void ListOfStudents() ;
	public void setAllStudents(List<Student> students);
	public void addStudent(Student Student);
	public void deleteStudent(int id);
	public void updateStudent(int id, String newName, String newEmail);
	public void searchStudent(int id);
	public void ListOfLecturer();
	public void setAllLecturer(List<Student> Lecturers);
	public void addLecturer(Lecturer Lecturer);
	public void deleteLecturer(int id);
	public void updateLecturer(int id, String newName, String newEmail);
	public void searchLecturer(int id);
	public void ListOfSubject();
	public void setAllSubject(List<Subject> Subjects);
	public void addSubject(Subject Subject);
	public void deleteSubject(int id);
	public void updateSubject(int id, String newName);
	public void searchSubject(int id);
	public void assignSubjectToStudent(int IDstudent, String nameSubject);
	public void assignSubjectToLecturer(int IDlecturer, String nameSubject) ;
}
