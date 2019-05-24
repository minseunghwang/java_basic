package day10.collection;

import java.util.Stack;

public class Test01_stack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("aaaa");
		stack.push("bbbb");
		stack.push("cccc");
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.empty());
		//System.out.println(stack.pop());
		

	}
}
