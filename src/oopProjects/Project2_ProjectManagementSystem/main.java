package oopProjects.Project2_ProjectManagementSystem;

public class main {
	public static void main(String[] args) { 
	Employee Employee = new Employee("ali","ali@gmail.com","IS");
	Employee.setEntryTime(8);
	Employee.setExitTime(5);
	Employee.setEntryTime(8);
	Employee.setExitTime(4);
	Employee.setEntryTime(10);
	Employee.setExitTime(5);
	Employee.setEntryTime(8);
	Employee.setExitTime(3);
	Employee.setEntryTime(8);
	Employee.setExitTime(5);
	Employee.setEntryTime(12);
	Employee.setExitTime(5);
	Employee.setEntryTime(1);
	Employee.setExitTime(5);

	Employee.WorkinActualDays();
	System.out.println("Working Hours Over Month : "+Employee.WorkingHoursOverMonth());
	Employee Employee1 = new Employee("ali","ali@gmail.com","backend");
	Employee Employee2 = new Employee("mohamed","mohamed@gmail.com","backend");
	Employee Employee3 = new Employee("dina","dina@gmail.com","backend");
	Employee Employee4 = new Employee("alaa","alla@gmail.com","frontend");
	Employee Employee5 = new Employee("mona","mona@gmail.com","frontend");
	Employee Employee6 = new Employee("donia","ali@gmail.com","Markting");
	Employee Employee7 = new Employee("ahmed","mohamed@gmail.com","Markting");
	Employee Employee8 = new Employee("magy","dina@gmail.com","Markting");
	Employee Employee9 = new Employee("frha","alla@gmail.com","Acounting");
	Employee Employee10 = new Employee("mona","mona@gmail.com","Acounting");
	TeamLeader TeamLeader1=new TeamLeader("mohamed","mohamed@gmail.com","Programming");
	TeamLeader TeamLeader2=new TeamLeader("mohsen","mohamed@gmail.com","Markting");
	TeamLeader TeamLeader3=new TeamLeader("mansor","mohamed@gmail.com","Acounting");
	TeamLeader1.addEmployee(Employee);
	TeamLeader1.addEmployee(Employee1);
	TeamLeader1.addEmployee(Employee2);
	TeamLeader1.addEmployee(Employee3);
	TeamLeader1.addEmployee(Employee4);
	TeamLeader1.ListOfEmployee();
	TeamLeader1.deleteEmployee(Employee2.getId());
	TeamLeader1.deleteEmployee(8);
	TeamLeader1.updateEmployee(Employee1.getId(), "ali123@gmail.com");
	TeamLeader1.searchEmployee(Employee2.getId());
	TeamLeader1.searchEmployee(Employee3.getId());
	TeamLeader1.ListOfEmployee();
	TeamLeader2.addEmployee(Employee6);
	TeamLeader2.addEmployee(Employee7);
	TeamLeader2.addEmployee(Employee8);
	TeamLeader3.addEmployee(Employee9);
	TeamLeader3.addEmployee(Employee10);
	TeamLeader2.ListOfEmployee();
	TeamLeader3.ListOfEmployee();
	Project Project1=new Project("College System","mange Colleg","completed");
	Project Project2=new Project("Project System","mange Project Sysrem","Active");
	Admin Admin1=new Admin("samir ahmed","samir@gmail.com");
	Admin1.viewProjects();
	Admin1.addProject(Project1);
	Admin1.addProject(Project2);
	Admin1.viewProjects();
	Task Task1=new Task("Admin manages Subjects","assign them for students and lecturers.");
	Task1.completeTask();
	Task Task2=new Task("Student can access exams ","Student can access only exams for his registered subjects.");
	TeamLeader1.addTask(Task1);
	TeamLeader1.addTask(Task2);
	System.out.println("/////////////////////////");
	TeamLeader1.assignTaskToEmployee(Task1.getId(), Employee1.getId(),Project1.getId() );
	System.out.println("/////////////////////////");
	TeamLeader1.assignTaskToEmployee(Task2.getId(), Employee1.getId(),Project1.getId() );
	TeamLeader1.viewCompletedTasks();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}