package dataStructure;

class Node1{
	Object data;
	Node1 next;
	public Node1(Object data){
		this.data = data;
	}
}
public class ConverseList {
	public static Node1 initList(int i){
		Node1 head = new Node1(i);
		Node1 tail = head;
		while(--i >=0){
			Node1 node = new Node1(i);
			tail.next = node;
			tail = node;
		}
		tail.next = null;
		return head;
	}
	public static Node1 converseList(Node1 head){
		Node1 tail = head;
		Node1 pre = head;
		Node1 current = head.next;
		Node1 next = head.next.next;
		while(next != null){
			current.next = pre;
			pre = current;
			current = next;
			next = next.next;
		}
		current.next = pre;
		head = current;
		tail.next = null;
		return head;
	}
	public static void main(String args[]){
		Node1 head = initList(10);
		printList(head);
		System.out.println();
		Node1 converseHead = converseList(head);
		printList(converseHead);
	}
	public static void printList(Node1 head){
	  Node1 temp = head;
	  while(temp != null){
	  	System.out.print(temp.data + ",");
	  	temp = temp.next;
	  }
	}
}
