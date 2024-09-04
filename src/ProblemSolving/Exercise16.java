package ProblemSolving;

public class Exercise16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 16. Write a Java program to print a face.
Expected Output

 +"""""+                                                 
[| o o |]                                                
 |  ^  |                                                 
 | '-' |                                                 
 +-----+ 
 
 */
		System.out.println(" +\"\"\"\"\"+ ");
		System.out.println("[| o o |]");
		System.out.println(" |  ^  | ");
		System.out.println(" | '-' | ");
		System.out.println(" +-----+ ");
		System.out.println("////////////////////");
		String [] face = new String[5];
		face[0]=" +\"\"\"\"\"+ ";
		face[1]="[| o o |]";
		face[2]=" |  ^  | ";
		face[3]=" | '-' | ";
		face[4]=" +-----+ ";
		for(int i=0;i<5;i++) {
			System.out.println(face[i]);
		}

	}

}
