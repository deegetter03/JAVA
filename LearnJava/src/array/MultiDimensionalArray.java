package array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // 3D array is an array of arrays of arrays
        // It can be visualized as a cube where each element is a point in 3D space
        // The first index represents the x-axis, the second index represents the y-axis, and the third index represents the z-axis
        // Example: arr[x][y][z] where x, y, z are the indices of the array
        // Here we have a 3D array with 2 elements in the x-axis, 2 elements in the y-axis, and 3 elements in the z-axis
		
		// x-axis 0,1 then y-axis 0,1 then elements in it are z-axis 3, 3 each -> {x0,y0,z0}, {x1,y1,z1}
		int arr[][][] = {{{1,2,10} , {3,4,11} } , {{5,6,12} , {7,8,12}}};
		
		System.out.println(arr[0][1][2]);

		System.out.println(arr[1][0][0]);

		System.out.println(arr[0][1][1]);

		System.out.println(arr[1][1][0]);
	}
}
