package oopProjects.Project2_ProjectManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Project {
	private int id;
    private String name;
    private String description;
    private String status; // e.g., "Active", "Completed", "On Hold"
	 private List<Task> Tasks=new ArrayList<Task>(); 
	 private static int countProject=0;

    public Project(String name, String description, String status) {
    	++countProject;
    	this.id=countProject;
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

	public List<Task> getTasks() {
		return Tasks;
	}

 
 
	public void addTask(Task Task) {
		Tasks.add(Task); 
	}
	@Override
	public String toString() {
		return "Project [name=" + name + ", description=" + description + ", status=" + status + ", Tasks=" + Tasks
				+ "]";
	}

    
}
