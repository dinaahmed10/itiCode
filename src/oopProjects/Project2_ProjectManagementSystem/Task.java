package oopProjects.Project2_ProjectManagementSystem;

public class Task {
	private int id;
    private String title;
    private String description; 
    private boolean completed;
    private static int countTeamLeader=0;
    Task(){
    	++countTeamLeader;
    	this.id=countTeamLeader; 
    }
    public Task(String title, String description) {
    	++countTeamLeader;
    	this.id=countTeamLeader;
        this.title = title;
        this.description = description; 
        this.completed = false;
    }

    public int getId() {
		return id;
	} 
	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	 
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public String getDescription() {
        return description;
    }

    
    public boolean isCompleted() {
        return completed;
    }

    public void completeTask() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Task Id: "+id+" Title: " + title + ", Description: " + description +  ", Status: " + (completed ? "Completed" : "Pending");
    }
}
