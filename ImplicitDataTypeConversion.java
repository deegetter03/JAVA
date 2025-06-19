public class ImplicitDataTypeConversion {

	public static void main(String[] args) {
        // Implicit data type conversion in Java
		int a = 100;
		System.out.println("Int representation: "+a);
		
		long b = a;
		System.out.println("Long representation: "+b);
		
		float c = b;
		System.out.println("Float representation: "+c);
	}
}