package dataStructure.linkList;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import dataStructure.linkList.LinkedList.Node;

//A simple Java program to introduce a linked list
class LinkedList
{
 Node head;  // head of list
  LinkedList() {
	

}
 
 
 public LinkedList(int arr[]) {
	Node current;
	Node pre;
	 
	 if(arr!= null)
	 {
		 head = new Node((int) arr[0]);
	 
		 pre =head;
	 for(int i=1;i<arr.length;i++)
	 {
	   current = new Node((int) arr[i]);
		pre.next=current;
		pre=current;
	 }
	 
	// printAll(this);
	 }
	 
}
 
 /* Linked list Node.  
  * This inner class is made static so that main() can access it */ 
 static class Node {
     int data;
     Node next;
 
  // Constructor   
     Node(int d) 
     { 
    	 data = d;  
    	 next=null; 
     } 
 }
 
 
 
 public int getLength(Node first)
	{
		Node fast;	
		fast=first;
	    int count=0;
		
	    while(fast!=null && fast.next!=null)		
		{

	
			fast=fast.next.next;
			count++;
		
		}
		
		count =2*count;
		if(fast!=null)
		{
			count =count + 1;
		}	
		
	
		
		
		 
		return count;
		
	}

 /* method to create a simple linked list with 3 nodes*/
 public static void main(String[] args)
 {
     /* Start with the empty list. */
     LinkedList llist = new LinkedList();

      llist.head  = new Node(1);
      Node second = new Node(2);
     Node third  = new Node(3);

     /* Three nodes have been allocated  dynamically.
       We have refernces to these three blocks as first,second and third

       llist.head        second              third
          |                |                  |
          |                |                  |
      +----+------+     +----+------+     +----+------+
      | 1  | null |     | 2  | null |     |  3 | null |
      +----+------+     +----+------+     +----+------+ */

    llist.head.next = second; // Link first node with the second node

     /*  Now next of first Node refers to second.  So they
         both are linked.

      llist.head        second              third
         |                |                  |
         |                |                  |
     +----+------+     +----+------+     +----+------+
     | 1  |  o-------->| 2  | null |     |  3 | null |
     +----+------+     +----+------+     +----+------+ */

     second.next = third; // Link second node with the third node

     /*  Now next of second Node refers to third.  So all three
         nodes are linked.

      llist.head        second              third
         |                |                  |
         |                |                  |
     +----+------+     +----+------+     +----+------+
     | 1  |  o-------->| 2  |  o-------->|  3 | null |
     +----+------+     +----+------+     +----+------+ */
     
    getNodeList(llist.head );
    llist.printList();
    
 }
 
 public void printList()
 {
     Node n = head;
     while (n != null)
     {
         System.out.print(n.data+" ");
         n = n.next;
     }
     System.out.println();
 }
 
 
 public void printAll(LinkedList list)
 {
	 Node read = list.head;
	 
	 while(read!= null)
	 {
		 System.out.print(read.data+" ");
		 read=read.next;
	 }
	 System.out.println();
	 
 }
 
 public static void getNodeList(Node n)
 {
	try {
		
		System.out.println("getNodeList called");
	
		

		File dir = new File("import//NewFolder1");
		 dir.mkdir();
		 
	}catch(Exception e)
	{
		
	}
	 
	 
	 if(n==null)
	 {
		 System.out.println("Linked list is empty");
	 }
	 else
	 {
		 if(n.next !=null)
		 {
			System.out.println("node value "+n.data);
			n=n.next;
			getNodeList(n);
		//	createFolderAndSaveFile();
		 }
		 else
		 {
			 System.out.println("Last node value "+n.data);
		 }
	 }	 
 }
 
 /***
  * Insert a node
  * @param location
  * @param value
  */
 
 public void addNode(String location,int value)
 {
	 Node cur= new Node(value);
	 Node pre=head;
	 
	 if(location.equals("start"))
	 {
	   cur.next = head;
	   head=cur;
	 }
	 else if(location.equals("end"))
	 {
		 while(pre.next!=null)
			 { 
				 pre=pre.next;
			 }
		 pre.next=cur;
	 }
	 else
	 {
		 int preNodeValue = Integer.valueOf(location);
		 while(pre.next != null && pre.data!= preNodeValue)
		 { 
			 pre=pre.next;
		 }
		 
		 if(pre.data == preNodeValue)
		 {
			 cur.next= pre.next;
			 pre.next = cur;
		 }
		 else
		 {
			 System.out.println("Node doesn't not found with value "+location);
		 }
	 }
	 
 }
 
 /***
  * Delete a node
  * @param value
  */
public void deleteNode(int value)
{
   Node cur,pre = null;
   boolean isExist = false;
   
   cur = head;
   if(head.data == value)
   {
	   head = head.next;
	   cur.next = null;
   }
   else 
   {
	   do {
		   	
			   if(cur.data== value)
			   {
				   pre.next = cur.next;
				   cur.next = null;
				   isExist=true;
				   break;
				 
			   }
			   pre=cur;
			cur=cur.next;
				   }while(cur.next!=null);
	   if(!isExist)
	   {
		   System.out.println(value+" value doesn't exist in list");
	   }
	   
   }

}

public boolean isPalindrome()
{
	Node pre,cur,slow,fast;
	cur=head;
	slow=cur;
	fast=cur;
	while(fast!= null && fast.next!= null)
	{
		slow=slow.next;
		fast=fast.next.next;
	}	
	
	return false;
	

}
 

public void reverseList()
{
  Node pre,cur,next;
  pre= null;
  cur=head;
  
  
  while(cur!= null)
	{
		next=cur.next;
		cur.next =pre;
		pre=cur;
		cur=next;
	}
 head=pre;
}
 
 
}