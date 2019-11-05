package dataStructure.linkList;

public class Main {
	
	
	public static void main(String[] args)
	 {

	DoublyLinkedList dll = new DoublyLinkedList(new int [] {1,2,3,4,5,6,7,8,9});
	dll.printAll();
	dll.addNodeAfterNode(6, 70);
	dll.printAll();
	dll.addNodeAtEnd(100);
	dll.printAll();
	dll.addNodeAtFront(10);
	dll.printAll();
	dll.addNodeBeforeNode(100, 90);
	dll.printAll();
	dll.reverse();
	dll.printAll();
	 
	dll.deleteFirstNode();
	dll.deleteLastNode();
	dll.printAll();
	 
	 
	dll.deleteFirstNode();
	dll.deleteLastNode();
	dll.printAll();
	 
	 
	dll.deleteFirstNode();
	dll.deleteLastNode();
	dll.printAll();
	 
//	dll.deletePerticularNode(51);
	dll.printAll();
	
	 }
	

}


