package QueueProblems;

import LinkedListProblems.INode;
import LinkedListProblems.MyLinkedListTest;

public class MyQueue {
	private final MyLinkedListTest MyLinkedListTest;
	private INode myNode;

	
	public MyQueue(){
		this.MyLinkedListTest = new MyLinkedListTest();
	}
	
	public void enqueue(INode myNode) {
		MyLinkedListTest.append(myNode);
		
		
	}

	public void printQueue() {
		MyLinkedListTest.printMyNodes();
		
	}

	public INode peak() {	
		return MyLinkedListTest.head;
	}

	public INode dequeue() {
		// TODO Auto-generated method stub
		return MyLinkedListTest.pop();
	}
}