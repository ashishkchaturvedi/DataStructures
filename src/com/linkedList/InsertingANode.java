package com.linkedList;

public class InsertingANode {
	
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
	
	public void print(){
		while(head != null){
			System.out.print(head.data+"->");
			head = head.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		InsertingANode node = new InsertingANode();
		node.insert(1);
		node.insert(2);
		node.insert(3);
		node.insert(4);
		node.insert(5);
		node.insert(6);
		node.print();

	}

}
