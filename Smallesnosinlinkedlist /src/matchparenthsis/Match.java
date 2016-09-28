package matchparenthsis;

public class Match {
	
	public static void main(String[] args) throws Element.StackOverflowException,Element.StackUnderflowException{
		
	        Minstack minimumStack = new Minstack();
	        minimumStack.push(2);
	        minimumStack.push(4);
	        minimumStack.push(10);

	        System.out.println("Minimum so far is: " + minimumStack.getMinimum());
	        minimumStack.push(1);
	        System.out.println("Minimum so far is: " + minimumStack.getMinimum());
	        minimumStack.push(0);
	        minimumStack.push(-1);
	        System.out.println("Minimum so far is: " + minimumStack.getMinimum());

	        minimumStack.pop();
	        System.out.println("Minimum so far is: " + minimumStack.getMinimum());
	        minimumStack.pop();
	        System.out.println("Minimum so far is: " + minimumStack.getMinimum());
	        minimumStack.pop();
	        System.out.println("Minimum so far is: " + minimumStack.getMinimum());
	}
	
	public static class Minstack{
		private Main<Integer> stack =new Main();
		private Main<Integer> mstack =new Main();
		
		public void push(int data) throws
        Element.StackOverflowException,
       Element.StackUnderflowException {
    int min = data;
    if (!mstack.isEmpty()) {
        if (min > mstack.peek()) {
            min = mstack.peek();
        }
    }
    stack.push(data);
    mstack.push(min);
}

public int pop() throws Element.StackUnderflowException {
    mstack.pop();
    return stack.pop();
}

public int getMinimum() throws Element.StackUnderflowException {
    return mstack.peek();
}
	}
	

}
