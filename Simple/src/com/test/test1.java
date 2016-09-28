package com.test;



public class test1 {
	public static void main(String[] args)
	{
		
		testlinkedlist<Integer> n = new testlinkedlist<Integer>();
        n.addNode(3);
        n.addNode(4);
        n.addNode(5);
        n.addNode(10);
        n.addNode(10);
        n.addNode(10);
        System.out.println("Printing all nodes through printnode function" );
        n.printNodes(); 
       int counter= n.countnodes();
       System.out.println("counter ="+counter );
      
       int element1= n.popenode();
       System.out.println("pop ="+element1 );
       n.delall();
       n.printNodes();
	}

}
