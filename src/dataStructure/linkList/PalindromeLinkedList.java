package dataStructure.linkList;

public class PalindromeLinkedList extends LinkedList{


	public Node reverse(Node first)
	{
		int length = getLength(first);
		
		first =getMiddle(first);
		if(length%2 ==0)
		{
			first=first.next;
		}
		
	Node pre,cur,next;
	pre=null;
	next =null;
	cur=first;
	
	while(cur!= null)
	{
		next=cur.next;
		cur.next =pre;
		pre=cur;
		cur=next;
	}
	
	return pre;
	}
	
	public Node getMiddle(Node first)
	{
		Node middle,fast;
		middle=first;
		fast=first;
	
		while(fast!=null && fast.next!=null)		
		{
			fast=fast.next.next;
			middle=middle.next;
		}		 
		
		
		return middle;
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
	
	
	
	public static void main(String[] args)
	 {	
	
	boolean ispalindrome=true;
	int [] arr = {7,8,10,10,8,7};
	LinkedList list = new LinkedList(arr);
	list.printList();

	PalindromeLinkedList pll = new PalindromeLinkedList();
   int length = pll.getLength(list.head);
  
    
    Node first =pll.getMiddle(list.head);
    System.out.println("middle nodes "+first.data);
    
    if(length%2==0)
    {
    	
    	first= first.next;
    }
   

    first= pll.reverse(first);
	
    Node headNode=list.head; 
    
	for(int i=0;i<length/2;i++)
	{
		if(first!=null && headNode.data == first.data)
		{
			headNode=headNode.next;
			first=first.next;
		}
		else
		{
			ispalindrome =false;
			break;
		}	
	}
	
	System.out.println("total nodes "+length);
	System.out.println("Is this is a palindrome list "+ispalindrome);
		
	
	
	
	
	
	
			
}

}
