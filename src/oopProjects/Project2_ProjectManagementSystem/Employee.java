package oopProjects.Project2_ProjectManagementSystem;

public class Employee extends Person{
	 private String department;
	 private int entryTime ;
	 private int exitTime;
	 private int[][] workinghours = new int[30][2]; //column 2 because 0 for enterTime 1 for exit time
   	 private int day =0;
	 private static int countEmployee=0;
		public Employee(){
			super();
			++countEmployee;
			 
		}
		
		 public Employee(String name,String email, String department){
			  super(++countEmployee,name,email);
			  this.department=department;
			}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public int getEntryTime() {
			return entryTime;
			 
		}

		public void setEntryTime(int entryTime) {
			this.entryTime = entryTime;
			workinghours[day][0]=entryTime;
		}

		public int getExitTime() {
			return exitTime;
		}

		public void setExitTime(int exitTime) {
			this.exitTime = exitTime;
			workinghours[day][1]=exitTime;
			day++;
		}

		public int[][] getWorkinghours() {
			return workinghours;
		}

		public void setWorkinghours(int[][] workinghours) {
			this.workinghours = workinghours;
		}

		public static int getCountEmployee() {
			return countEmployee;
		}
		
		public void WorkingMonthReport(){
			System.out.println("\tEntryTime\tExitTime");
			for(int i=0;i<workinghours.length;i++) {
				System.out.println("day "+(i+1)+"    "+workinghours[i][0]+"\t\t"+workinghours[i][1]);
			}
		}
		public void WorkinActualDays(){
			System.out.println("\tEntryTime\tExitTime");
			for(int i=0;i<day;i++) {
				System.out.println("day "+(i+1)+"    "+workinghours[i][0]+"\t\t"+workinghours[i][1]);
			}
		}
		public int WorkingHoursOverMonth(){ 
			int WorkingHours=0;
			for(int i=0;i<day;i++) { 
				WorkingHours+= Math.abs(workinghours[i][0]-+workinghours[i][1]);
			}
			return WorkingHours;
			
		}
		
		
}
