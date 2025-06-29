package statements;

public class EnhancedForLoop {
    public static void main(String[] args) {
        // This is an enhanced for loop example
        // It iterates over an array of integers and prints each item
        // The enhanced for loop is also known as the "for-each" loop
        // It simplifies the syntax for iterating over arrays and collections

		int nums[] = {1,2,3,4,5};
		
		for(int item : nums) {
			System.out.println("items are: "+item);
		}
	}
}
