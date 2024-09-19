package oopProjects.Project2_ProjectManagementSystem;
public abstract class Person {
	private int id;
	private static int countUser=0;
	private String name;
	private String email;
	
	
	//overloading
	public Person(){
		countUser++; 
	}
 
	public Person(int id,String name,String email){
		 
		this.id=id;
		this.name=name;
		this.email=email;
		countUser++;
	}
	public  int getId() {
		return id;
	}
	 
	protected static int count() {
		return countUser;
	}
 
	public String getName() {
		return name;
	}
	public void setName(String username) {
		name = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	 
	@Override
	public String toString() {
		return "User [Id=" + id + ", Name=" + name + ", Email=" + email + "]";
	}
	

}
