package Stack;

import java.util.LinkedList;

public class LinkedListStack {
	Node head;
	
	class Node{
		int value;
		Node next;
	}
	
	public LinkedListStack() {
		head = null;
	}
	
	// push :as value to the beginning of the list
	public void push(int value) {
		Node extraNode = head;
		head = new Node();
		head.value = value;
		head.next = extraNode;
	}
	
	public int pop() {
		if(head==null) {
			System.out.println("stack is empty:");
		}
		int value = head.value;
		head = head.next;
		return value;
	}
	
	
	
	public static void main(String[] args) {
		
		LinkedListStack lis = new LinkedListStack();
		System.out.println(lis.pop());
		
		lis.push(10);
		lis.push(20);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
