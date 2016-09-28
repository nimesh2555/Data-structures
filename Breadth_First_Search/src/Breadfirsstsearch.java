
public class Breadfirsstsearch {
	
	public static void main(String[] args) throws
    Queue.QueueUnderflowException, Queue.QueueOverflowException {
   Node<Character> a = new Node<>('A');
Node<Character> b = new Node<>('B');
Node<Character> c = new Node<>('C');
Node<Character> d = new Node<>('D');
Node<Character> e = new Node<>('E');
Node<Character> f = new Node<>('F');
Node<Character> g = new Node<>('G');
Node<Character> h = new Node<>('H');
Node<Character> x = new Node<>('X');

a.setLeftchild(b);
a.setRightchild(c);
c.setLeftchild(d);
c.setRightchild(e);
d.setLeftchild(f);
d.setRightchild(h);
e.setRightchild(g);
b.setLeftchild(x);
System.out.println("BFS");

breadthFirst(a);


}
	public static void print(Node node) {
        System.out.print(node.getData() + "->");
    }

    public static void breadthFirst(Node root) throws
            Queue.QueueUnderflowException, Queue.QueueOverflowException {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new Queue<>(Node.class);
        queue.enqueue(root);
        while (!queue.isEmpty()) {
            Node node = queue.dequeue();
            print(node);

            if (node.getLeftchild() != null) {
                queue.enqueue(node.getLeftchild());
            }
            if (node.getRightchild() != null) {
                queue.enqueue(node.getRightchild());
            }
        }
    }
			   
	
	
	
	public static class Node<T>{
    private T data;
    public T getData() {
		return data;
	}
	public Node(T data ){
		
		this.data = data;
		
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getLeftchild() {
		return leftchild;
	}
	public void setLeftchild(Node<T> leftchild) {
		this.leftchild = leftchild;
	}
	public Node<T> getRightchild() {
		return rightchild;
	}
	public void setRightchild(Node<T> rightchild) {
		this.rightchild = rightchild;
	}
	private Node<T> leftchild;
    private Node<T> rightchild;
	}

}
