package methodCalling;

public class MethodCallingDemo {
    public static void main(String[] args) {
		int i=1;
		int result = changeValue(i);
		System.out.println("i is: " + result);
	}
	
	//in java only there is passed by value, no pass by reference
	
	private static int changeValue(int i) {
		i = i + 1;
		return i;
	}
}