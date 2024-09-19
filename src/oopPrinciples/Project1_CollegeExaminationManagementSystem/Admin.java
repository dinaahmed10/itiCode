package oopPrinciples.Project1_CollegeExaminationManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User implements AdminMangeEntities{
	private String Password;
	private static int countAdmin=0;
	private List<Student> Students=new ArrayList<Student>(); 
	private List<Lecturer> Lecturers=new ArrayList<Lecturer>();
	private List<Subject> Subjects=new ArrayList<Subject>();
	public Admin(){
		++countAdmin;
	}
public Admin(String Username,String Password, String email){
	   super(++countAdmin,Username,email);
		this.Password=Password;
	}
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	public static int count() {
		return countAdmin;
	}
@Override
	public String toString() {
		return "Admin [id=" + super.getId() + ", Username=" + super.getUsername() + ", email=" + super.getEmail() + "]";
	} 
	//////////////////Students/////////////////////
	public List<Student> ListStudents() {
		return Students;
	}
	public void ListOfStudents() {
		for(int i=0;i<Students.size();i++) {
			 System.out.println(Students.get(i).toString());
		}
	}
	public void setAllStudents(List<Student> students) {
		Students = students;
	}
	public void addStudent(Student Student) {
		Students.add(Student); 
		 System.out.println("Added: " + Student.toString());
	}
	public void deleteStudent(int id) {
		 
		for(int i=0;i<Students.size();i++) {
			if(Students.get(i).getId()==id) {
				Students.remove(i);
				System.out.println("Deleted Student with ID: " + id);
				return;
			}
		}
		System.out.println("Student not found.");
		 
	}
	 public void updateStudent(int id, String newName, String newEmail) {
	        for (int i=0;i<Students.size();i++) {
	            if (Students.get(i).getId()==id) {
	            	 Students.get(i).setUsername(newName);
	            	 Students.get(i).setEmail(newEmail); 
	                System.out.println("Updated: " +  Students.get(i).toString());
	                return;
	            }
	        }
	        System.out.println("Student not found.");
	 }
	public void searchStudent(int id) {
		 
		for(int i=0;i<Students.size();i++) {
			if(Students.get(i).getId()==id) {
			     System.out.println("Found: " + Students.get(i).toString());
				return;
			}
		}
		System.out.println("Student with ID " + id + " not found.");
		 
	}
	
	
	//////////////////Lecturers/////////////////////
	public void ListOfLecturer(){
		for(int i=0;i<Lecturers.size();i++) {
			 System.out.println(Lecturers.get(i).toString());
		}
	}
	public void setAllLecturer(List<Student> Lecturers){
		Students = Lecturers;
	}
	public void addLecturer(Lecturer Lecturer){
		 Lecturers.add(Lecturer); 
		 System.out.println("Added: " + Lecturer.toString());
	}
	public void deleteLecturer(int id){
		 
		for(int i=0;i<Lecturers.size();i++) {
			if(Lecturers.get(i).getId()==id) {
				Lecturers.remove(i);
				System.out.println("Deleted Lecturer with ID: " + id);
				return;
			}
		}
		System.out.println("Student not found.");
		 
	}
	 public void updateLecturer(int id, String newName, String newEmail){
	        for (int i=0;i<Lecturers.size();i++) {
	            if (Lecturers.get(i).getId()==id) {
	            	Lecturers.get(i).setUsername(newName);
	            	Lecturers.get(i).setEmail(newEmail); 
	                System.out.println("Updated: " +  Lecturers.get(i).toString());
	                return;
	            }
	        }
	        System.out.println("Student not found.");
	 }
	public void searchLecturer(int id){
		 
		for(int i=0;i<Lecturers.size();i++) {
			if(Lecturers.get(i).getId()==id) {
			     System.out.println("Found: " + Lecturers.get(i).toString());
				return;
			}
		}
		System.out.println("Lecturer with ID " + id + " not found.");
		 
	}
     //////////////////Subjects///////////////////// 
	public void ListOfSubject(){
		for(int i=0;i<Subjects.size();i++) {
			 System.out.println(Subjects.get(i).toString());
		}
	}
	public void setAllSubject(List<Subject> Subjects){
		this.Subjects = Subjects;
	}
	public void addSubject(Subject Subject){
		Subjects.add(Subject); 
		 System.out.println("Added: " +Subject.toString());
	}
	public void deleteSubject(int id){
		 
		for(int i=0;i<Subjects.size();i++) {
			if(Subjects.get(i).getId()==id) {
				Subjects.remove(i);
				System.out.println("Deleted Subject with ID: " + id);
				return;
			}
		}
		System.out.println("Subject not found.");
		 
	}
	 public void updateSubject(int id, String newName){
	        for (int i=0;i<Subjects.size();i++) {
	            if (Subjects.get(i).getId()==id) {
	            	Subjects.get(i).setName(newName); 
	                System.out.println("Updated: " +  Subjects.get(i).toString());
	                return;
	            }
	        }
	        System.out.println("Subject not found.");
	 }
	public void searchSubject(int id){
		 
		for(int i=0;i<Subjects.size();i++) {
			if(Subjects.get(i).getId()==id) {
			     System.out.println("Found: " + Subjects.get(i).toString());
				return;
			}
		}
		System.out.println("Subject with ID " + id + " not found.");
		 
	}
	@Override
	public void assignSubjectToStudent(int IDstudent, String nameSubject) {
		Student Student= new Student();
		Student=Student.StudentFound(IDstudent, Students);
		if(Student!=null) {
		for(int i=0;i<Subjects.size();i++) {
			if(Subjects.get(i).getName().equals(nameSubject)) {
				for(int j=0; j< Student.getSubjects().size();j++) {
					if(Student.getSubjects().get(j).getName().equals(nameSubject)) {
						System.out.println("already this Subject founded");
						return;
					}
				}
				Student.addSubject(Subjects.get(i));
				System.out.println("assign Subject To Student done");
				return;
			}
		}
		System.out.println("Subject not found.");
		}
		 
	}
	@Override
	public void assignSubjectToLecturer(int IDlecturer, String nameSubject) {
		Lecturer lecturer= new Lecturer();
		lecturer=lecturer.LecturerFound(IDlecturer, Lecturers);
		for(int i=0;i<Subjects.size();i++) {
			if(Subjects.get(i).getName().equals(nameSubject)) {
				for(int j=0; j< lecturer.getSubjects().size();j++) {
					if(lecturer.getSubjects().get(j).getName().equals(nameSubject)) {
						System.out.println("already this Subject founded");
						return;
					}
				}
				
				lecturer.addSubject(Subjects.get(i));
				System.out.println("assign Subject To Lecturer done");
				return;
			}
		}
		System.out.println("Subject not found.");
		
	}
	
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

