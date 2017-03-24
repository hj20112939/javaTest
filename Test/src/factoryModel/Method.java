package factoryModel;
interface IFactory{
	public Iproduct getProduct();
}
class FactoryA implements IFactory{
	@Override
	public Iproduct getProduct() {
		return new ProductA();
	}
}
class FactoryB implements IFactory{
	@Override
	public Iproduct getProduct() {
		return new ProductB();
	}
}
public class Method {
	public static void main(String args[]){
		IFactory f = new FactoryA();
		Iproduct p = f.getProduct();
		p.print();
	}
}
