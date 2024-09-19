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
}
}