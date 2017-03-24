package dataStructure;

class Node {
	private Object data;
	private Node next;

	public Node(Object data) {
		this.data = data;
	}

	public Node() {
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}

public class LinkedList {
	private Node firstNode;

	public LinkedList() {
		firstNode = null;
	}

	public boolean add(Object data) {
		Node node = new Node(data);
		node.setNext(firstNode);
		firstNode = node;
		return true;
	}

	public boolean delete(Object data) {
		if (firstNode != null ) {
			if (firstNode.getData() == data) {
				firstNode = firstNode.getNext();
			}
			Node nodeTemp = new Node();
			nodeTemp = firstNode;
			while (nodeTemp.getNext() != null) {
				if (nodeTemp.getNext().getData() == data) {
					nodeTemp.setNext(nodeTemp.getNext().getNext());
				}
				nodeTemp = nodeTemp.getNext();
			}
		}
		return false;
	}

	public void printAll() {
		Node nodeTemp = new Node();
		nodeTemp = firstNode;
		while (nodeTemp != null) {
			System.out.println(nodeTemp.getData());
			nodeTemp = nodeTemp.getNext();
		}
	}

	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//list.printAll();
		list.delete(3);
		list.printAll();
	}
}
