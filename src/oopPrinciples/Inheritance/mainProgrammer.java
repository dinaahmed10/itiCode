package oopPrinciples.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class mainProgrammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer Programmer=new Programmer();
		Programmer.setName("dina ahmed");
		Programmer.setEmployeeId(1);
		Programmer.setSalary(18000);
		Programmer.setTitel("Frash");
		List<String> pp=new ArrayList<>();
		pp.add("College Examination Management System");
		pp.add("Task Management System");
		pp.add("Courses Management System");
		Programmer.setProgrammingProjects(pp);
		
		System.out.println(Programmer.displayInfo());
		//System.out.println(Programmer.giveRaise(2000));
		System.out.println("\n\n\ntotalSalary" +Programmer.giveRaise(2000));
		System.out.println("totalSalary  :"+Programmer.getSalary());
		Programmer.addProgrammingProject("Parking Guidance System");
		System.out.println("programmingProjects : "+Programmer.getProgrammingProjects());
		
		System.out.println("///////////////\n\n"+Programmer.displayInfo());
		
	}

}
