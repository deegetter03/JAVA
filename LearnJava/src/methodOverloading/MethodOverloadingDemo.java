package methodOverloading;

public class MethodOverloadingDemo {
    // Method overloading is a feature that allows a class to have more than one method with the same name,but different parameters.
    // This can be achieved by changing the number of parameters or the type of parameters.

    public int multiply(int x, int y) {
		return (x*y);
	}
	
	public int multiply(int x, int y, int z) {
		return (x*y*z);
	}
	
	public double multiply(double x, double y) {
		return (x*y);
	}
	
	public static void main(String[] args) {
		MethodOverloadingDemo answer = new MethodOverloadingDemo();
		System.out.println(answer.multiply(10, 20));
		System.out.println(answer.multiply(10, 20, 30));
		System.out.println(answer.multiply(10.3, 20.6));
	}
}