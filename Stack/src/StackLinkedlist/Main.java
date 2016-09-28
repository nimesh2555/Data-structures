package StackLinkedlist;

import StackLinkedlist.Stack.StackOverflowException;
import StackLinkedlist.Stack.StackUnderflowException;

public class Main {
	public static void main(String []args) throws StackOverflowException, StackUnderflowException {
	
		
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack size: " + stack.getSize());
        System.out.println("Stack full?: " + stack.isFull());
        System.out.println("Stack empty?: " + stack.isEmpty());

        stack.push(4);
        System.out.println("Stack size: " + stack.getSize());
        System.out.println("Stack full?: " + stack.isFull());
        System.out.println("Stack empty?: " + stack.isEmpty());

        System.out.println("Stack peek: " + stack.peek());

        int data = stack.pop();
        System.out.println("Popped element: " + data);

        System.out.println("Peek again: " + stack.peek());
	}

}
