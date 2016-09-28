package com.test;



public class testlinkedlist<T extends Comparable<T>> implements Cloneable {

	private testnode<T> head = null;

    public testlinkedlist() {
    }
    
    /**
     * Append a new node to the end of the linked list.
     */
    public void addNode(T data) {
        if (head == null) {
            head = new testnode<T>(data);
        } else {
            testnode<T> curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(new testnode<T>(data));
        }
    }
    
    
    
    
    public int countnodes()
    {
    	 int c;
    	if (head == null){
    		System.out.println("Nos of nodes = 0");
    		c=0;
    		
    	}
    	else {
    		 c=1;
    		testnode<T> curr = head;
    		while(curr!= null)
    		{
    		curr=curr.getNext();
    		c++;
    		}
    		System.out.println("Nos of nodes =  "+c);
    	}
    	return c;
    }
    

    /**
     * Print all the nodes in the linked list.
     */
    public void printNodes() {
     if (head  == null) {
         System.out.println("There is no node in the linked list");
     } else {
         testnode<T> curr = head;
         int i = 1;
         while (curr != null) {
             System.out.println("Node<T> number " + i + ", the value it stores is " + curr.toString());
             curr = curr.getNext();
             i++;
         }
     }
    }
    
    public T popenode()
    {
    	if(head == null)
    	{
    		return null;
    		
    	}
    	else{
    		head=head.getNext();
    		return head.getData();
    		
    	}
    	
    }
    
    public void delall()
    {
    	head = null;
    }    
    
    
}
