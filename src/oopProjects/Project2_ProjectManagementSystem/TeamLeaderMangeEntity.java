package oopProjects.Project2_ProjectManagementSystem;

import java.util.List;

import oopProjects.Project1_CollegeExaminationMangementSystem.Subject;

public interface TeamLeaderMangeEntity {
	public void ListOfEmployee();
	public void addEmployee(Employee Employee);
	public void deleteEmployee(int id);
	public void updateEmployee(int id, String emil);
	public void searchEmployee(int id);
	public void addTask(Task Task);
	public void assignTaskToEmployee(int IdTask, int IdEmployee ,int IdProject);
	public void viewCompletedTasks() ;

}
