package dataStructure;

import dataStructure.DoubleLinkedlist.DNode;

public class CircleLinkedList {
	private DNode head;
	private DNode tail;
	public CircleLinkedList(){
		head = null;
		tail = head;
	}
	public void add(Object data){
		DNode node = new DNode(data);
		if(head == null){
			head = node;
			tail = node;
			head.pre = tail;
			tail.next = head;
		}else{
			tail.next = node;
			node.pre = tail;
			tail = node;
			tail.next = head;
			head.pre = tail;
		}
	}
	public static void main(String args[]){
		CircleLinkedList list = new CircleLinkedList();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(7);
		DNode temp = list.head;
		while(temp != list.tail){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
