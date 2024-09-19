package oopProjects.Project1_CollegeExaminationMangementSystem;

public abstract class User {
	private int id;
	private static int countUser=0;
	private String Username;
	private String email;
	
	
	//overloading
	public User(){
		countUser++; 
	}
 
	public User(int id,String Username,String email){
		 
		this.id=id;
		this.Username=Username;
		this.email=email;
		countUser++;
	}
	public  int getId() {
		return id;
	}
	 
	protected static int count() {
		return countUser;
	}
 
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	 
	@Override
	public String toString() {
		return "User [id=" + id + ", Username=" + Username + ", email=" + email + "]";
	}
	

}
