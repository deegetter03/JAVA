package stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // This is a Stack example
        // It demonstrates how to create a Stack, add elements, and perform various operations
        // Stack is part of the Java Collections Framework and follows Last In First Out (LIFO) principle
        // It provides methods to push, pop, and peek at elements in the stack
        
		Stack<String> stack = new Stack<>();
		
		stack.push("India");
		stack.push("England");
		stack.push("America");
		
		System.out.println("Stack: " + stack);
		
		String poppedElement = stack.pop();
		System.out.println("PoppedElement1: " + poppedElement);
		
		String poppedElement2 = stack.pop();
		System.out.println("PoppedElement2: " + poppedElement2);
		
		String TopElement = stack.peek();
		System.out.println("TopElement: " + TopElement);
		
		System.out.println("Now the Stack looks like: " + stack);
	}
}
