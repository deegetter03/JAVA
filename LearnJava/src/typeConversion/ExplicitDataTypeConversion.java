package typeConversion;

public class ExplicitDataTypeConversion {

	public static void main(String[] args) {
        // Explicit data type conversion in Java
        // This is also known as narrowing conversion
        // It occurs when a larger data type is converted to a smaller data type

		double a = 50.67;
		System.out.println("Double representation: "+a);
		
		float f = (float) a;
		System.out.println("Float representation: "+f);
		
		long b = (long) a;
		System.out.println("Long representation: "+b);
		
		int c = (int) b;
		System.out.println("Int representation: "+c);
	}

}
