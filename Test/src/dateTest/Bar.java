package dateTest;
class Foo{
	int i = 0;
}
public class Bar extends Foo {
	int i = 1;
	public static void main(String[] args){
		Bar foo = new Bar();
		System.out.println(foo.i);
	}
}
