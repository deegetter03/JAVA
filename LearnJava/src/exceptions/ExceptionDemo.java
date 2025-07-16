package exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {

		int data = 100/0;  //divide by zero
		System.out.println(data);
		
		String a = null; // null value
		System.out.println(a.charAt(0));
	}
}