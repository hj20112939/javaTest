package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
	public static void printQueue(Queue queue){
		while(queue.peek() != null){
			System.out.print(queue.remove());
		}
	}
	public static void main(String args[]){
		Queue<Integer> queue = new LinkedList<Integer>();
		Queue<Character> queue1 = new LinkedList<Character>();
		Random rand = new Random(47);
		for(int i = 0;i < 10;i++){
			queue.offer(rand.nextInt(i + 10));
		}
		for(char c : "queueDemo".toCharArray()){
			queue1.offer(c);
		}
		printQueue(queue);
		printQueue(queue1);
	}
}
