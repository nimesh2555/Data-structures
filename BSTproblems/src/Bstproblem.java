

public class Bstproblem {
	public static void main(String[] args) {
        Node<Integer> one = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        Node<Integer> three = new Node<>(3);
        Node<Integer> four = new Node<>(4);
        Node<Integer> five = new Node<>(5);
        Node<Integer> six = new Node<>(6);
        Node<Integer> seven = new Node<>(7);
        Node<Integer> eight = new Node<>(8);
        Node<Integer> nine = new Node<>(9);
        Node<Integer> zero = new Node<>(0);
        Node<Integer> head = insert(null, five);

        insert(head, one);
        insert(head, seven);
        insert(head, three);
        insert(head, eight);
        insert(head, two);
        insert(head, nine);
        insert(head, six);
        insert(head, zero);
        insert(head, four);

        inOrder(head);
        print11(lookup(head, 7));
        print11(lookup(head, 12));
        minBST(head);
        int m=depthBST(head);
        System.out.println("Depth "+m);
        mirroBST(head);
        inOrder(head);
        System.out.println("Tree count for 1 node: " + countTrees(1));
        System.out.println("Tree count for 2 nodes: " + countTrees(2));
        System.out.println("Tree count for 3 nodes: " + countTrees(3));
        System.out.println("Tree count for 6 nodes: " + countTrees(6));
        System.out.println("");
        inOrder(head);
        System.out.println("");
        printRange(head, 2, 9);
        System.out.println("Is BST: " + isBinarySearchTree(head, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public static void print(Node node) {
        System.out.print(node.getData() + "->");
    }

    public static void print11(Node node) {
        if (node == null) {
            System.out.print("Not found!");
            return;
        }
        System.out.println(node.getData() + " found!");
    }
    
    
  public static void  minBST(Node<Integer> head){
	 if(head.getLeftChild()==null){
		 System.out.println("Min "+head.data);
		 }
	  
	 if(head.getLeftChild()!=null){
		 minBST(head.getLeftChild());
		 }
	 }
  
  public static boolean isBinarySearchTree(Node<Integer> root, int min, int max) {
      if (root == null) {
          return true;
      }

      if (root.getData() <= min || root.getData() > max) {
          return false;
      }

      return isBinarySearchTree(root.getLeftChild(), min, root.getData())
              && isBinarySearchTree(root.getRightChild(), root.getData(), max);
  }
  
  public static int depthBST(Node<Integer> head){
		 if(head==null){
			 return 0;
			 }
		 
		 if(head.getLeftChild()==null&&head.getRightChild()==null){	 
			 return 0;
			 }
		 
		 int ldepth=1+depthBST(head.getLeftChild());
		 int rdepth=1+depthBST(head.getRightChild());
		 return(Math.max(ldepth,rdepth));
		 }
  
  public static void mirroBST(Node<Integer> head){
		 if(head==null){
			 return;
			 }
		 mirroBST(head.getLeftChild());
		 mirroBST(head.getRightChild());
		Node<Integer> temp= head.getLeftChild();
		head.setLeftChild(head.getRightChild());
		head.setRightChild(temp);
		
		 }

  

  public static int countTrees(int numNodes) {
      if (numNodes <= 1) {
          return 1;
      }

      int sum = 0;
      for (int i = 1; i <= numNodes; i++) {
          int countLeftTrees = countTrees(i - 1);
          int countRightTrees = countTrees(numNodes - i);

          sum = sum + (countLeftTrees * countRightTrees);
      }

      return sum;
  }

  
  public static void printRange(Node<Integer> root, int low, int high) {
      if (root == null) {
          return;
      }

      if (low <= root.getData()) {
          printRange(root.getLeftChild(), low, high);
      }

      if (root.getData()>=low && root.getData() <= high) {
          System.out.println(root.getData());
      }

      if (high > root.getData()) {
          printRange(root.getRightChild(), low, high);
      }
  }
  
  
    
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.getLeftChild());
        print(root);
        inOrder(root.getRightChild());
    }

    public static Node<Integer> insert(Node<Integer> head, Node<Integer> node) {
        if (head == null) {
            return node;
        }
        
        if (node.getData() <= head.getData()) {
            head.setLeftChild(insert(head.getLeftChild(), node));
        } else {
            head.setRightChild(insert(head.getRightChild(), node));
        }
        
        return head;
    }
    
    public static Node<Integer> lookup(Node<Integer> head ,int data){
    	if (head==null)
    		return null;
    	
    	if(head.getData()==data)
    		return head;
    	if(data<=head.getData())
    	return(lookup(head.leftChild,data));
    	else
    	return(lookup(head.rightChild,data));
    	
    	
    }
    
    public static class Node<T> {
        private T data;
        private Node<T> leftChild;
        private Node<T> rightChild;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Node<T> getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node<T> leftChild) {
            this.leftChild = leftChild;
        }

        public Node<T> getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node<T> rightChild) {
            this.rightChild = rightChild;
        }
    }


}
