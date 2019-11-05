package dataStructure.linkList;

import dataStructure.linkList.LinkedList.Node;

//Class for Doubly Linked List
public class DoublyLinkedList
{
 Node head; // head of list
  
 /* Doubly Linked list Node*/
 class Node
 {
     int data;
     Node prev;
     Node next;
      
      
     // Constructor to create a new node
     // next and prev is by default initialized as null
     Node(int d){data=d;
     prev=next=null;
     } 
 }

 public DoublyLinkedList() {
	 
	 
 }

 public DoublyLinkedList(int arr[]) {
	Node current;
	Node pre;
	 
	 if(arr!= null)
	 {
		 head = new Node(arr[0]);
	 
		 pre = head;
	 for(int i=1;i<arr.length;i++)
	 {
	   current = new Node(arr[i]);
		pre.next=current;
		current.prev=pre;
		pre=current;
	 }
	 
	// printAll(this);
	 }
	 
}
 
 
public DoublyLinkedList(Node head) {
	super();
	this.head = head;
}


public void addNodeAtFront(int d)
	{
			Node newNode = new Node(d);
		if(head!=null)
		{
			newNode.next =head;
			head.prev=newNode;
		}
		
			head= newNode;	
		


	}

public void addNodeAtEnd(int d)
	{
		Node newNode = new Node(d);
		Node cur;
		cur =head;
		if(head!=null)
			{
				while(cur.next != null)
				{
					cur=cur.next;
				}
				cur.next =newNode;
				newNode.prev=cur;
			}
			else
			{
				head=newNode;
			}	
	}

public void addNodeBeforeNode(int nodeData,int d)
{
	
	Node newNode = new Node(d);
	Node cur;
	cur =head;
	if(head!=null)
	{
		while(cur.data != nodeData && cur != null)
		{
			cur=cur.next;
		}
		if(cur.data == nodeData)
		{
			cur.prev.next =newNode;
			newNode.prev=cur.prev;
			newNode.next=cur;
			cur.prev=newNode;
		}
		else
		{
			System.out.println("Node element not found "+nodeData);
		}	
		
	}
	else
	{
		System.out.println("List is empty");
	}	
	
}

public void addNodeAfterNode(int nodeData,int d)
{
	
	Node newNode = new Node(d);
	Node cur;
	cur =head;
	if(head!=null)
	{
		while(cur.data != nodeData && cur != null)
		{
			cur=cur.next;
		}
		if(cur.data == nodeData && cur.next!= null)
		{
			newNode.prev=cur;
			newNode.next=cur.next;
			cur.next.prev = newNode;
			cur.next=newNode;
		}
		else if(cur.data == nodeData && cur.next== null)
		{
			newNode.prev=cur;
			newNode.next=cur.next;
			cur.next=newNode;
		}
		else
		{
			System.out.println("Node element not found "+nodeData);
		}	
		
	}
	else
	{
		System.out.println("List is empty");
	}	
	
}

public void printAll()
	{
		Node cur=head;
		while(cur!= null)
		{
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
		System.out.println();
	
	}

public void reverse()
{
	Node temp=null,cur=head;
	if(head!= null)
	{	
		while(cur!= null)
		{
			
			temp=cur.prev;
			cur.prev=cur.next;
			cur.next =temp;
			cur=cur.prev;		
		}
	  
	head=temp.prev;
	}

}

public void deleteFirstNode()
{

	if(head!= null)
	{
		if(head.next!= null)
		{
			head.next.prev=null;
			head=head.next;		
		}
		
	}
	
}

public void deleteLastNode()
{
  Node cur= head;
	if(head!= null)
	{
		if(head.next== null)
		{
			head=null;
		}
		else
		{
			while(cur.next!= null)
			{
				cur=cur.next;		
			}
			cur.prev.next =null;
			cur.prev =null;
		}
		
	}
	
}

public void deletePerticularNode(int d)
{
  Node cur= head;
	if(head!= null)
	{
		while(cur.data !=d && cur != null)
		{
			cur =cur.next;
		}
		if(cur.data ==d)
		{
			if(head.data ==d)
			{
				deleteFirstNode();
			}
			else if(cur.next!=null)
			{
				cur.prev.next =cur.next;
				cur.next.prev =cur.prev;
			}
			else
			{
				deleteLastNode();
			}	
		}
		else
		{
			System.out.println("Node doesn't found with value "+d);
		}
	}
	
}


}

 