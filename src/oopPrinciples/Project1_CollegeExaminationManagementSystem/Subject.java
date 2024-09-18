package oopPrinciples.Project1_CollegeExaminationManagementSystem;

public   class Subject   {
	private int id;
	private String name;
	
	private static int countSubject=0;
	public Subject(){
		++countSubject;
		this.id=countSubject;
	}
	
  public Subject(String Username){
	  ++countSubject;
	  this.id=countSubject;
	  this.name=Username;
	}
 
  public static int count() {
		return countSubject;
	}
  
  

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

 
public String toString() {
	return "Subject [id=" + id + ", name=" + name + "]";
}
}
