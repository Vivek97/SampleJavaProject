package dataStructure.stack;
import dataStructure.stack.*;

//Driver code
class Main
{
public static void main(String args[])
{
Stack s = new Stack();
s.push(10);
s.push(20);
s.push(30);
System.out.println(s.pop() + " Popped from stack");


System.out.println("//----------------------------------------------------//");
Queue queue = new Queue(1000);

queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);
queue.enqueue(40);

System.out.println(queue.dequeue() + 
             " dequeued from queue\n");

System.out.println("Front item is " + 
                       queue.front());
  
System.out.println("Rear item is " + 
                        queue.rear());
}
}
