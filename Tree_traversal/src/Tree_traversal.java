import java.util.Scanner;

public class Tree_traversal {
	
	public static void main(String[] args){
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
        System.out.println("Preorder");
        preOrder(a);
        System.out.println("Inorder");
        inOrder(a);
        System.out.println("Postorder");
        postOrder(a);
		
	}
	 public static void preOrder(Node<Character>root) {
	        if (root == null) {
	            return;
	        }

	       System.out.println(root.getData());
	        preOrder(root.getLeftchild());
	        preOrder(root.getRightchild());
	    }

	 public static void inOrder(Node<Character>root) {
	        if (root == null) {
	            return;
	        }

	       
	        inOrder(root.getLeftchild());
	        System.out.println(root.getData());
	        inOrder(root.getRightchild());
	    }
	 public static void postOrder(Node<Character>root) {
	        if (root == null) {
	            return;
	        }

	      
	        postOrder(root.getLeftchild());
	        postOrder(root.getRightchild());
	        System.out.println(root.getData());
	    }
	
	
	
	public static class Node<T>{
		private T data;
		private Node<T> leftchild;
		private Node<T> rightchild;
		public Node(T data) {
			
			this.data = data;
			
		}
		public T getData() {
			return data;
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
	}
}
