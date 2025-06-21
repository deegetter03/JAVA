public class TwoDimensionalArray {

	public static void main(String[] args) {
        // This is a simple Java program that demonstrates the use of two-dimensional arrays.
		
		int arr[][] = {{2,7,9}, {3,6,1}, {7,4,2}};
		
		for(int i=0; i<3; i++) {  // rows
			for(int j=0; j<3; j++) { // columns
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); //for next line
		}
	}
}