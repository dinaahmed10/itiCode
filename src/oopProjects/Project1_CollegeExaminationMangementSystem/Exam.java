package oopProjects.Project1_CollegeExaminationMangementSystem;

import java.util.List;

public class Exam {
	  private  int id;
	  private String Subjectcode;
	    private String examDate;
	    private String description;
	    private String TypeExam;
		private static int countAdmin=0;
		private int degree;
		
	    
	    public Exam(){
	    	++countAdmin;
	    }
		public Exam(String Subjectcode, String examDate, String description) {
			++countAdmin;
			this.id=countAdmin;
			this.Subjectcode = Subjectcode;
			this.examDate = examDate;
			this.description = description;
		}
		
		public int getDegree() {
			return degree;
		}
		public void setDegree(int degree) {
			this.degree = degree;
		}
		public String getSubjectCode() {
			return Subjectcode;
		}
		public void setSubjectCode(String Subjectcode) {
			this.Subjectcode = Subjectcode;
		}
		public String getExamDate() {
			return examDate;
		}
		public void setExamDate(String examDate) {
			this.examDate = examDate;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public String getTypeExam() {
			return TypeExam;
		}
		public void setTypeExam(String typeExam) {
			TypeExam = typeExam;
		}
		public Exam ExamFound(int id,List<Exam> Exams) {
			for(int i=0;i<Exams.size();i++) {
				if(Exams.get(i).getId()==id) {
					return Exams.get(i);
				}
		}
			System.out.println("Exam with ID "+id+" not found ");
			return null;
		}
		@Override
		public String toString() {
			return "Exam [id=" + id + ", Subjectcode=" + Subjectcode + ", examDate=" + examDate + ", description="
					+ description + ", TypeExam=" + TypeExam + "]";
		}
	    

}
