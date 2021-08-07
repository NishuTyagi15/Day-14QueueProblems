package QueueProblems;

import LinkedListProblems.INode;
import LinkedListProblems.MyLinkedListTest;

public class MyQueue {
	private final MyLinkedListTest MyLinkedListTest;
	
	public MyQueue(){
		this.MyLinkedListTest = new MyLinkedListTest();
	}
	
	public void enqueue(INode myNode) {
		MyLinkedListTest.append(myNode);
		
		
	}

	public void printStack() {
		MyLinkedListTest.printMyNodes();
		
	}

	public INode peak() {	
		return MyLinkedListTest.head;
	}
}