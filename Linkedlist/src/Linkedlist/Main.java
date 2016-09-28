package Linkedlist;

public class Main {
	public static void main( String []args)
	{
		  LinkedList<Integer> n = new LinkedList<Integer>();
		   
	        n.addNode(345);
	        n.addNode(34533);
	        n.addNode(3453366);
	       
	        System.out.println("Printing all nodes through printnode function" );
	        n.printData();
	        n.count();
	        n.firstandlast();
	        n.popFirst();
	        n.printData();
	        n.count();
	        n.delall();
	        n.printData();
	        n.addNode(11);
	        n.addNode(3433423);
	        n.addNode(23);
	        n.addNode(33);
	        n.printData();
	        n.reverselist();
	        n.printData();
	}

}
