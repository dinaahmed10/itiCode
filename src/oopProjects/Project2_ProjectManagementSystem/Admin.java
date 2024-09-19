package oopProjects.Project2_ProjectManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Person{
	private static List<Project> projects=new ArrayList<>();;
	 private static int countAdmin=0;
	public Admin() {
		super();
		++countAdmin;
	}
	
    public Admin(String name,String email) {
    	 super(++countAdmin,name,email);
    }

    public static List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public void addProject(Project project) {
        projects.add(project);
    }

    public void viewProjects() {
    	if(projects.size()>0) {
    	for(int i=0;i<projects.size();i++) {
			 System.out.println(projects.get(i).toString());
		}
    	}
    	else {
    		 System.out.println("No projects available.");
    	}
    }

}
