package oopProjects.Project2_ProjectManagementSystem;

import java.util.ArrayList;
import java.util.List;

 
public class TeamLeader extends Person implements TeamLeaderMangeEntity {
	 private String department;
	 private List<Employee> Employees=new ArrayList<Employee>(); 
	 private List<Task> Tasks=new ArrayList<Task>(); 
 
	 private static int countTeamLeader=0;
		public TeamLeader(){
			super();
			++countTeamLeader;
			 
		}
		
		 public TeamLeader(String name,String email, String department){
			  super(++countTeamLeader,name,email);
			  this.department=department;
			}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public static int getCountTeamLeader() {
			return countTeamLeader;
		}

		
		@Override
		public String toString() {
			return "TeamLeader [Id=" + super.getId() + ", Name=" + super.getName() + ", Email=" + super.getEmail() + "department=" + department + ", Employees=" + Employees + "]";
		}

		@Override
		public void ListOfEmployee() {
			for(int i=0;i<Employees.size();i++) {
				 System.out.println(Employees.get(i).toString());
			}
			
		}

		@Override
		public void addEmployee(Employee Employee) {
			Employees.add(Employee); 
			 System.out.println("Added: " + Employee.toString());
			
		}

		@Override
		public void deleteEmployee(int id) {
			for(int i=0;i<Employees.size();i++) {
				if(Employees.get(i).getId()==id) {
					Employees.remove(i);
					System.out.println("Deleted Employee with ID: " + id);
					return;
				}
			}
			System.out.println("Employee not found.");
			
		}

		@Override
		public void updateEmployee(int id, String newEmil) {
			for (int i=0;i<Employees.size();i++) {
	            if (Employees.get(i).getId()==id) { 
	            	Employees.get(i).setEmail(newEmil); 
	                System.out.println("Updated: " +  Employees.get(i).toString());
	                return;
	            }
	        }
	        System.out.println("Employee not found.");
			
		}

		@Override
		public void searchEmployee(int id) {
			for(int i=0;i<Employees.size();i++) {
				if(Employees.get(i).getId()==id) {
				     System.out.println("Found: " + Employees.get(i).toString());
					return;
				}
			}
			System.out.println("Employee with ID " + id + " not found.");
			
		}

		@Override
		public void assignTaskToEmployee(int IdTask, int IdEmployee,int IdProject) {
			for(int i=0;i<Employees.size();i++) {
				if(Employees.get(i).getId()==IdEmployee) {
					for(int j=0;j<Admin.getProjects().size();j++) {
						if(Admin.getProjects().get(j).getId()==IdProject) {
							for(int y=0;y<Tasks.size();y++) {
								if( Tasks.get(y).getId()==IdTask) {
									Employees.get(i).addTask(Tasks.get(y));
									Admin.getProjects().get(j).addTask(Tasks.get(y));
									 System.out.println("Done Added: " + Tasks.get(y).toString());
									 System.out.println("Done Added: " +	Employees.get(i).toString());
									 System.out.println("Done Added: " + Admin.getProjects().get(j).toString());
									return;	
								}
							}
							 System.out.println("Task not found.");
							  return; 
						}
					}
					  System.out.println("Project not found.");
					  return;
				}
			}
			System.out.println("Employee with ID " + IdEmployee + " not found.");
		}
		public void addTask(Task Task) {
			Tasks.add(Task);
			 System.out.println("Added: " + Task.toString());
			
		}

		@Override
		public void viewCompletedTasks() {
			for(int y=0;y<Tasks.size();y++) {
				if(Tasks.get(y).isCompleted()) {
					System.out.println(Tasks.get(y).toString());
				}
			}
			
		}
		 
		
}
