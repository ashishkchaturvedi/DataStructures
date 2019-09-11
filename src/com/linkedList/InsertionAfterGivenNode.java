package com.linkedList;


public class InsertionAfterGivenNode {
	
	class Node{
		int data;
		Node next;
		
		public Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	Node head = null;
	
	public void insert(int d){
		Node n = new Node(d);
		if(head == null){
			head = n;
		}
		else{
			n.next = head;
			head = n;
		}
	}
	
	public void insertAfter(int d, Node n){
		Node new_node = new Node(d);
		new_node.next = n.next;
		n.next = new_node;
	}
	
	public void print(){
		while(head != null){
			System.out.print(head.data+"->");
			head = head.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		
		InsertionAfterGivenNode node = new InsertionAfterGivenNode();
		
		node.insert(1);
		node.insert(2);
		node.insert(9);
		node.insert(12);
		node.insert(8);
		node.insertAfter(4, node.head.next);
		node.print();

	}

}
