package typeConversion;

public class ImplicitDataTypeConversion {

	public static void main(String[] args) {
        // Implicit data type conversion in Java
        // This is also known as widening conversion
        // It occurs when a smaller data type is converted to a larger data type
        // Example: int to long, long to float, etc.

		int a = 100;
		System.out.println("Int representation: "+a);
		
		long b = a;
		System.out.println("Long representation: "+b);
		
		float c = b;
		System.out.println("Float representation: "+c);
	}
}