package com.linkedList;

public class InsertAtEnd {
	
	class Node{
		int data;
		Node next;
		
		public Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	Node head = null;
	
	public void insertAtEnd(int d){
		Node new_node = new Node(d);
		Node curr = head;
		if(head == null){
			head = new_node;
		}
		else{
			while(curr.next != null){
				curr = curr.next;
			}
			curr.next = new_node;
			new_node.next = null;
		}
	}
	
	public void print(){
		while(head != null){
			System.out.print(head.data+"->");
			head = head.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		InsertAtEnd node = new InsertAtEnd();
		node.insertAtEnd(1);
		node.insertAtEnd(2);
		node.insertAtEnd(3);
		node.insertAtEnd(4);
		node.insertAtEnd(5);
		node.print();

	}

}
