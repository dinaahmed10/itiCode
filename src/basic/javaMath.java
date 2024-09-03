package basic;

public class javaMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//The Math.max(x,y) method can be used to find the highest value of x and y:
		System.out.println(Math.max(5, 10));
		//The Math.min(x,y) method can be used to find the lowest value of x and y:
		System.out.println(Math.min(5, 10));
		//The Math.sqrt(x) method returns the square root of x:
		System.out.println(Math.sqrt(64));
		//Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
		System.out.println(Math.random());
		int randomNum = (int)(Math.random() * 101);
		System.out.println(randomNum);
	}

}
