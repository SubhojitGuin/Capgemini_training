package collectionFramework.listInterface;

import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) {
		// Create a Stack
		Stack<String> stack = new Stack<>();
		
		// Add elements (Push)

		stack.push("Java");
		stack.push("Python");
		stack.push("C++");
		
		// Read top element (Peek)
		System.out.println("Top element: " + stack.peek()); // C++
		
		// Update top element
		System.out.println(stack.pop());
		stack.push("JavaScript");
		
		// Delete element
		stack.pop();
		
		// Print the updated stack
		System.out.println("Updated Stack: " + stack);
	}

}
