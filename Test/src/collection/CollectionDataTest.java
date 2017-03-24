package collection;

import innnerClasses.Generator;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

//适配器adapter
class CollectionData<T> extends ArrayList<T>{
	public CollectionData(Generator<T> gen,int quantity){
		for(int i = 0;i < quantity;i++){
			add(gen.next());
		}
	}
	public static <T> CollectionData<T> list(Generator<T> gen,int quantity){
		return new CollectionData<T>(gen,quantity);
	}
}

//被适配的类adaptee
class Government implements Generator<String>{
	String[] s = ("this is just a collectionTest").split(" ");
	private int index;
	@Override
	public String next() {
		return s[index++];
	}
	
}
//客户端
public class CollectionDataTest {
	public static void main(String args[]){
		Set<String> set = new LinkedHashSet<String>(new CollectionData<String>(new Government(),4));
		set.addAll(CollectionData.list(new Government(), 4));
		System.out.println(set);
	}
}
