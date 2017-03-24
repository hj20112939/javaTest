package dataStructure;
public class DoubleLinkedlist {
	static class DNode{
		Object data;
		DNode pre;
		DNode next;
		public DNode(Object data){
			this.data = data;
		}
	}
	private DNode head;
	private DNode tail;
	public DoubleLinkedlist(){
		head = null;
		tail = head;
	}
	public void add(Object data){
		DNode node = new DNode(data);
		if(head == null){
			head = node;
			tail = node;
			tail.next = null;
			head.pre = null;
		}else{
			tail.next = node;
			node.pre = tail;
			tail = node;
		}
	}
	public boolean delete(Object data){
		return true;
	}
	public Object get(int index){
		DNode temp = head;
		while(temp != null && index-- > 0){
			temp = temp.next;
		}
		if(temp == null){
		  try {
				throw new Exception(){};
			} catch (Exception e) {
				System.err.println("超出界限");
				return null;
			}
		}
		return temp.data;
	}
	public Object getByTail(int index){
		DNode temp = tail;
		while(temp != null && index-- > 0){
			temp = temp.pre;
		}
		if(temp == null){
		  try {
				throw new Exception(){};
			} catch (Exception e) {
				System.err.println("超出界限");
				return null;
			}
		}
		return temp.data;
	}
	public static void main(String args[]){
		DoubleLinkedlist dl = new DoubleLinkedlist();
		dl.add(1);
		dl.add(2);
		dl.add(3);
		DNode temp = dl.head;
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(dl.get(1));
		System.out.println(dl.getByTail(2));
	}
}
