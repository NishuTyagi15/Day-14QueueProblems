package QueueProblems;

import org.junit.Assert;
import org.junit.Test;

import LinkedListProblems.INode;
import LinkedListProblems.MyNode;

public class MyQueueTest {
	@Test
	public void test() {
		
		
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(myThirdNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myFirstNode);
        INode dequeue = myQueue.dequeue();	
		myQueue.printQueue();
		
		Assert.assertEquals(dequeue, myFirstNode);
		
	}
}