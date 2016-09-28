package Linkedlist;


public class LinkedList<T extends Comparable<T>>  {
private Node <T> head =null;

public LinkedList() {
	
}


public void addNode(T data){
	  if (head == null)
	{
		  
	 head =new Node<T>(data);
	}
	else{
		Node<T> curr = head;
		while ( curr.getNext() != null)
		{
			curr=curr.getNext();
		}
		curr.setNext(new Node<T>(data));
	}
	
}

public void printData(){
	System.out.println("printing");
	if (head==null)
	{
		System.out.println("No Nodes present");
	}
	else
	{
		Node<T> curr=head;
		
		while(curr!=null)
		{
			
			System.out.println("Nodes "+curr.toString());
			curr=curr.getNext();
		}
		
	}
	
}
 public void count()
 {
	 if (head ==null)
	 {
		 System.out.println("No Nodes present 1"); 
	 }
	 else
	 {
		 Node<T> curr= head;
		 int i=0;
		 while(curr!=null)
		 {
			i++; 
			curr=curr.getNext();
		 }
		 System.out.println("No Nodes present "+i);
	 }
 }
 
 public void firstandlast()
 {
	 if (head ==null)
	 {
		 System.out.println("No Nodes present "); 
	 }
	 else
	 {
		 Node<T> curr= head;
		
		 System.out.println("First Element "+curr.toString());
		 while(curr.getNext()!=null)
		 {
			
			curr=curr.getNext();
		 }
		 System.out.println("Last Element "+curr.toString());
	 }
 }
 
 public void popFirst()
 {
	 if (head ==null)
	 {
		 System.out.println("No Elemenst to pop "); 
	 }
	 else
	 {
		 Node<T> curr= head;
		
		 System.out.println("Pop Element "+curr.toString());
			head=curr.getNext();
		 
		
	 }
 }
 
 public void delall()
 {
	 head=null;
 }
 
 public void reverselist()
 {
	 if(head == null || head.getNext() == null) {
         return;
     }

     Node<T> prev = null;
     Node<T> curr = head;
     while (curr != null) {
         Node<T> next = curr.getNext();
         curr.setNext(prev);
         prev = curr;
         curr = next;
     }

     head = prev;
 }
 
 
}
