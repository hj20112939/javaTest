package test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Num {
	public static void main(String args[]){
		List<Integer> list = getList(new int[]{2,71,11,13,7},9);
		for(Integer i : list){
			System.out.println(i);
		}
	}
	public static List<Integer> getList(int[] num,int target){
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i =0;i < num.length;i++){
			map.put(num[i], i);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			Integer i = entry.getKey();
			if(map.get((target - i)) != null){
				list.add(map.get(i));
				list.add(map.get((target - i)));
				return list;
			}
		}
		return list;
	}
}
