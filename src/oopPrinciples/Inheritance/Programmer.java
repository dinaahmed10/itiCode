package oopPrinciples.Inheritance;

import java.util.List;

public class Programmer extends Employee {
	private String titel;
	private List<String> programmingProjects;
	
	public Programmer(){
		
	}
public Programmer(String name, int employeeId, double salary,String titel,List<String> programmingProjects){
		super(name,employeeId,salary);
		this.titel=titel;
		this.programmingProjects=programmingProjects;
		super.name=name;
		 
	}

public List<String> displayProgrammingProjects() {
	return programmingProjects;
}
public void addProgrammingProject(String ProgrammingProject ) {
	programmingProjects.add(ProgrammingProject);
}
@Override
public String displayInfo() {
	return super.displayInfo()+"\nTitel : "+titel +" \nprogrammingProjects : "+displayProgrammingProjects();
	
}
public String getTitel() {
	return titel;
}
public void setTitel(String titel) {
	this.titel = titel;
}
public List<String> getProgrammingProjects() {
	return programmingProjects;
}
public void setProgrammingProjects(List<String> programmingProjects) {
	this.programmingProjects = programmingProjects;
}
	
}
