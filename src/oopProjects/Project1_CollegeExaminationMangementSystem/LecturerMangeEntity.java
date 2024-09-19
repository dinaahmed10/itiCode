package oopProjects.Project1_CollegeExaminationMangementSystem;

public interface LecturerMangeEntity {
	public void addExam(Exam Exam);
    public void deleteExam(int id) ;
    public void updateExam(int id,String examDate) ;
    public void listExams();
    public void putExamOfSubject(Exam Exam, Subject Subject);
    public void putTypeQuestions(int IDExam,String TypeExam);
}
