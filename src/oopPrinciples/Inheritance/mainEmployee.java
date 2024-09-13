package oopPrinciples.Inheritance;

public class mainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.setName("ahmed");
		employee.setEmployeeId(1);
		employee.setSalary(2250);
		
		System.out.println(employee.displayInfo());
		System.out.println(employee.giveRaise(450));
		
		Employee employee2=new Employee();
		employee2.setName("ali");
		employee2.setEmployeeId(2);
		employee2.setSalary(3350);
		
		System.out.println(employee2.displayInfo());
		System.out.println(employee2.giveRaise(550));
	}

}
