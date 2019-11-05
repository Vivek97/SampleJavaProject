package dataStructure.linkList;

public class LinkedListDeletion {
	
	
	
	public static void main(String[] args)
	 {
		LinkedList list = new LinkedList(new int[]  {1,2,3,4,5,6,7,8,9});
		
		list.printList();
		list.deleteNode(3);
		list.printList();
		list.deleteNode(1);
		list.printList();
		list.deleteNode(7);
		list.printList();
		list.deleteNode(9);
		list.printList();
		
		list.addNode("start", 10);
		list.printList();
		list.addNode("end", 11);
		list.printList();
		list.addNode("8", 212);
		list.printList();

		list.reverseList();
		list.printList();
		
	 }
	


}
