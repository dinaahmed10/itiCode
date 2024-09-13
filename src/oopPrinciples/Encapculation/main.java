package oopPrinciples.Encapculation;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Student1=new Student();
		Student1.setName("dina ahmed ali");
		System.out.print("Name : "+Student1.getName());
		Student1.setId(1);
		Student1.setEmail("dina_ahmed@gmail.com");
		Student1.setAge(20);
		System.out.println(" , id : "+Student1.getId());
		System.out.println(Student1.displayStudent());
		Student Student2=new Student("dina ali salem",2,"dinaAli231@gmail.com",21);
		System.out.println(Student2.displayStudent());
	}

}
