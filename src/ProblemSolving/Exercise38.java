package ProblemSolving;

public class Exercise38 {
	public static void main(String[] args) {
		/**
38. Write a Java program to count letters, spaces, numbers and other characters in an input string.
Expected Output

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23                                               
space: 9                                                 
number: 10                                               
other: 6
		 * */
		int sumLetter=0;
		int sumSpace=0;
		int sumNumber=0;
		int sumOther=0;
	String string="Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
	char[] ch = string.toCharArray();
	System.out.println(ch);
	for(int i=0;i<string.length();i++) {
		if(Character.isSpaceChar(ch[i])){
			sumSpace++;
		}
		else if(Character.isDigit(ch[i])){
			sumNumber++;
		}
		else if(Character.isLetter(ch[i])){
			sumLetter++;
		}else {
			sumOther++;
		}
		
		 
		
	}
	System.out.println("letter :"+sumLetter);
	System.out.println("space :"+sumSpace);
	System.out.println("number :"+sumNumber);
	System.out.println("other :"+sumOther);
	
	}
}
