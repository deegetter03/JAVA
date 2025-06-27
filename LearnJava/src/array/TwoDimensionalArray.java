package array;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // A two-dimensional array is an array of arrays.
        // It is a data structure that can store a fixed-size sequential collection of elements of the same type in a tabular form (rows and columns).
        // Syntax to declare a two-dimensional array:
        // dataType[][] arrayName = new dataType[rows][columns];
        // Example: int[][] arr = new int[3][3]; // 3 rows and 3 columns
        
		
		int arr[][] = {{2,7,9}, {3,6,1}, {7,4,2}};
		
		for(int i=0; i<3; i++) {  // rows
			for(int j=0; j<3; j++) { // columns
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); //for next line
		}
	}
}
