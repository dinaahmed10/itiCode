package basic;

public class Loops {
	public static void main(String[] args) {
		{
			///////////////while///////
/*
 while (condition) {
  // code block to be executed
}

*/
			int i = 0;
			while (i < 5) {
			  System.out.println(i);
			  i++;
			}
			//////////
			int countdown = 3;

			while (countdown > 0) {
			  System.out.println(countdown);
			  countdown--;
			}

			System.out.println("Happy New Year!!");
			///////////
			int dice = 1;

while (dice <= 6) {
  if (dice < 6) {
    System.out.println("No Yatzy.");
  } else {
    System.out.println("Yatzy!");
  }
  dice = dice + 1;
}
		}
		
		{
			/////For///
			/*
			 for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
			 */
			
			for (int i = 0; i < 5; i++) {
				  System.out.println(i);
				}
			
			for (int i = 0; i <= 10; i = i + 2) {
				  System.out.println(i);
				}
			
			///break;
			for (int i = 0; i < 10; i++) {
				  if (i == 4) {
				    break;
				  }
				  System.out.println(i);
				}
			////continue;
			for (int i = 0; i < 10; i++) {
				  if (i == 4) {
				    continue;
				  }
				  System.out.println(i);
		}
	}}
}
