package matchparenthsis;

import matchparenthsis.Element.StackOverflowException;
import matchparenthsis.Element.StackUnderflowException;

public class Main<T> {
	
	 private static int MAX_SIZE = 40;

	    private Element<T> top;
	    private int size = 0;
	    public static void main(String[] args) throws StackUnderflowException, StackOverflowException{
	    MAX_SIZE = 40;	
	    
	    Main<Integer> stack = new Main();

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

        try {
            stack.push(4);
            stack.push(5);
        } catch (StackOverflowException soe) {
            System.out.println("Stack is full! No room available.");
        }

        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (StackUnderflowException sue) {
            System.out.println("Stack is empty! No elements available.");
        }
	    
	    }
	    public void push(T data) throws StackOverflowException {
	        if (size == MAX_SIZE) {
	            throw new StackOverflowException();
	        }

	        Element elem = new Element(data, top);
	        top = elem;
	        size++;
	    }

	    public T pop() throws StackUnderflowException {
	        if (size == 0) {
	            throw new StackUnderflowException();
	        }
	        T data = top.getData();
	        top = top.getNext();

	        size--;

	        return data;
	    }

	    public T peek() throws StackUnderflowException {
	        if (size == 0) {
	            throw new StackUnderflowException();
	        }

	        return top.getData();
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public boolean isFull() {
	        return size == MAX_SIZE;
	    }

	    public int getSize() {
	        return size;
	    }


}
