package basic;

public class IFjavaElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to a == b
Not Equal to: a != b
 */
		
		/*
		 Use if to specify a block of code to be executed, if a specified condition is true
         Use else to specify a block of code to be executed, if the same condition is false
         Use else if to specify a new condition to test, if the first condition is false
         Use switch to specify many alternative blocks of code to be executed
		 */
		/*
		 *
		 * if (condition) { 
		  } 
		   else if (condition2) {
		  }
		  else {
		  }
		  
		  *
		  *
		  */
		{
			int x = 20;
			int y = 20;
			if (x > y) {
			  System.out.println("x is greater than y");
			}else if (x < y) {
				  System.out.println("Good day.");
			}else {
				  System.out.println("Good evening.");
		}
		}
		
		{
			//Find out if a number is even or odd:
			int myNum = 5;

			if (myNum % 2 == 0) {
			  System.out.println(myNum + " is even");
			} else {
			  System.out.println(myNum + " is odd");
			} 
		}
		{
			////////////Java Switch///////////
			/*
			 Instead of writing many if..else statements, you can use the switch statement.
			 The switch statement selects one of many code blocks to be executed
			  
			    When Java reaches a break keyword, it breaks out of the switch block.

This will stop the execution of more code and case testing inside the block.

When a match is found, and the job is done, it's time for a break. There is no need for more testing.
			  
			 * */
			
			
			int day = 8;
			switch (day) {
			  case 1:
			    System.out.println("Monday");
			    break;
			  case 2:
			    System.out.println("Tuesday");
			    break;
			  case 3:
			    System.out.println("Wednesday");
			    break;
			  case 4:
			    System.out.println("Thursday");
			    break;
			  case 5:
			    System.out.println("Friday");
			    break;
			  case 6:
			    System.out.println("Saturday");
			    break;
			  case 7:
			    System.out.println("Sunday");
			    break;
			    default:
			    	 System.out.println("none");
			}
		}
	}

}
