package factoryModel;
interface Iproduct{
	public void print();
}
class ProductA implements Iproduct{
	@Override
	public void print() {
		System.out.println("A");
	}
}
class ProductB implements Iproduct{
	@Override
	public void print() {
		System.out.println("B");
	}
}
class Factory{
	public Iproduct getProduct(String type){
		if("A".equals(type)){
			return new ProductA();
		}else{
			return new ProductB();
		}
	}
}
public class Simple {
	public static void main(String args[]){
		Factory f = new Factory();
		Iproduct p = f.getProduct("B");
		p.print();
	}
}
