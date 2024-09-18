package oopPrinciples.Encapculation;

public class main {

	public static void main(String[] args) {
	
		/*// TODO Auto-generated method stub
		Student Student1=new Student(5);
		Student1.setName("dina ahmed ali");
		System.out.print("Name : "+Student1.getName());
		Student1.setId(1);
		Student1.setEmail("dina_ahmed@gmail.com");
		Student1.setAge(20);
		System.out.println(" , id : "+Student1.getId());
		System.out.println(Student1.displayStudent());
		Student Student2=new Student("dina ali salem",2,"dinaAli231@gmail.com",21);
		System.out.println(Student2.displayStudent());
		
		*/
/////////////////////////////////
		Student Student1=new Student(5);
		Student Student2=new Student("dina ali salem",2,"dinaAli231@gmail.com",21);
		Student Student3=new Student(3);
		
		System.out.println(" 1, id : "+Student1.getId());
		System.out.println(" 2, id : "+Student2.getId());
		System.out.println(" 3, id : "+Student3.getId());
		System.out.println(" 1, id : "+Student1.getAge());
		System.out.println(" 2, id : "+Student2.getAge());
		System.out.println(" 3, id : "+Student3.getAge());
		Student1.setAge(32);
		Student2.setAge(62);
		Student3.setAge(22);
		System.out.println(" 1, id : "+Student1.getAge());
		System.out.println(" 2, id : "+Student2.getAge());
		System.out.println(" 3, id : "+Student3.getAge());
		Student1.setAge(12);
		Student2.setAge(621);
		Student3.setAge(212);
		System.out.println(" 1, id : "+Student1.getAge());
		System.out.println(" 2, id : "+Student2.getAge());
		System.out.println(" 3, id : "+Student3.getAge());
		
	}

}
