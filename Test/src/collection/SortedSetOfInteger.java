package collection;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOfInteger {
	public static void main(String args[]){
		SortedSet<Integer> set = new TreeSet<Integer>();
		Random rand = new Random(40);
		for(int i =0; i < 1000; i++){
			set.add(rand.nextInt(30));
		}
		System.out.println(set.toString());
	}
}
