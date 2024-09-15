package problemString;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] sourceArray = {1, 2, 3, 4, 5};
        
        // Destination array
        int[] destArray = new int[5];
        
        // Copying elements from sourceArray to destArray
        System.arraycopy(sourceArray, 0, destArray, 0, sourceArray.length);
        
        // Printing the destination array
        System.out.println("Destination array after copy:");
        for (int value : destArray) {
            System.out.print(value + " ");
        }
	}

}
