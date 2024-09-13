package oopPrinciples.Encapculation;

public class Student {
	private String name;
	private int id;
	private int age;
	private String email; 
	
	public Student(){
		
	}
	
	 public Student(String name, int id, String email, int age) {
 
		this.name = name;
		this.id = id;
		this.email = email;
		this.age=age;
	}

	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	} 
	public String displayStudent() {
		return "Name : "+this.getName()+" , id : "+this.getId()+" ,email : "+this.getEmail()+" , age :"+this.getAge();
	}
	
}
