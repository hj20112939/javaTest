package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {
	public static void main(String args[]){
		Map<String,Integer> map = new HashMap<String,Integer>();
		Random rand = new Random(47);
		for(int i = 0;i < 10000;i++){
			String temp = String.valueOf(rand.nextInt(20));
			map.put(temp, map.containsKey(temp)?map.get(temp) + 1:1);
		}
		for(String key:map.keySet()){
			System.out.println("key:" + key + ",value:" + map.get(key));
		}
	}
}
