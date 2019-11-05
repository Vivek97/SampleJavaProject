package dataStructure.linkList;

public class MissingItemInList extends PalindromeLinkedList {
	
public int getMissingItem(LinkedList list)
    {
		int no,length;
		int [] array;
		boolean isElementFound = false;
		Node current = list.head;
		length = list.getLength(current);
		array = new int[length];
		
		for(int i=0; i<length;i++)
		{
			array[i] = current.data;
			current =current.next;
		}
		
		
		while(!isElementFound)
		{
			no= length/2 +1;
			if(array[no] != no-1)
			{
				
			}
			
		}
		
		
		
	    return 0;
	}
	
	
	
	public static void main(String args[])
	{
	int[] intArr={1,2,4,5,6,7,8,9};
	LinkedList list = new LinkedList(intArr);
	
	
	
	list.printList();
	
	}
	
	
	

}
