package oopPrinciples.Inheritance;

public class Employee {
	private String name; 
	private int employeeId;   
	private double salary;   
	 
	
	public Employee()    
	{
		
	}
	public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }
	
	public String displayInfo() {
        return "Employee Name: " + name + "\nID: " + employeeId + "\nSalary: $" + String.format("%.2f", salary);
    }
    
	
	// Method to give a raise
    public String giveRaise(double amount) {
        salary += amount;
        return "New salary for " + name + ": $" + String.format("%.2f", salary);
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	   public double getSalary() {
		return salary;
	}
	 public void setSalary(double salary) {
		this.salary = salary;
	}
	final public void printEmployee() {
		 System.out.println("Employee");
	 }
}
