package basic;

public class JavaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
//square brackets
	///String[] cars;
    ///String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	///int[] myNum = {10, 20, 30, 40};
		//Note: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);
		cars[0] = "Opel";
		System.out.println(cars[0]);
		System.out.println(cars.length);
		for (int i = 0; i < cars.length; i++) {
			  System.out.println(cars[i]);
			}
		
		
		{
			int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
			float avg,sum = 0;


			int length = ages.length; ///8
			for (int age : ages) {
			  sum += age; //95+
			} 
			System.out.println(sum);
			avg = sum / length; 
			System.out.println("The average age is: " + avg);
		}
		{
			int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
			float avg, sum = 0;
			int length = ages.length; //8
			int lowestAge = ages[0];//20
			for (int age : ages) { 
			  if (lowestAge > age) { 
			    lowestAge = age;
			  }
			}
			System.out.println("The lowest age in the array is: " + lowestAge);
		}
		
		///////////Java Multi-Dimensional Arrays////////////////////
		
	}

}
