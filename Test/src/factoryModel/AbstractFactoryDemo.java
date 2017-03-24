package factoryModel;

//抽象产品

abstract class SportCar {
	private String name;

	public abstract void drive();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

abstract class BusinessCar {
	private String name;

	public abstract void drive();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

// 具体产品（Bmw和Audi同理）
class BenzSportCar extends SportCar {
	public void drive() {
		System.out.println(this.getName()
				+ "----BenzSportCar-----------------------");
	}
}

class BenzBusinessCar extends BusinessCar {
	public void drive() {
		System.out.println(this.getName()
				+ "----BenzBusinessCar-----------------------");
	}
}

class BmwSportCar extends SportCar {
	public void drive() {
		System.out.println(this.getName()
				+ "----BmwSportCar-----------------------");
	}
}

class BmwBusinessCar extends BusinessCar {
	public void drive() {
		System.out.println(this.getName()
				+ "----BmwBusinessCar-----------------------");
	}
}

class AudiSportCar extends SportCar {
	public void drive() {
		System.out.println(this.getName()
				+ "----AudiSportCar-----------------------");
	}
}

class AudiBusinessCar extends BusinessCar {
	public void drive() {
		System.out.println(this.getName()
				+ "----AudiBusinessCar-----------------------");
	}
}

// 抽象工厂
abstract class AbstractFactory {
	public abstract SportCar createSportCar(String car) throws Exception;

	public abstract BusinessCar createBusinessCar(String car) throws Exception;
}

// 具体工厂
class BenzFactory extends AbstractFactory {

	@Override
	public SportCar createSportCar(String car) throws Exception {
		return new BenzSportCar();
	}

	@Override
	public BusinessCar createBusinessCar(String car) throws Exception {
		return new BenzBusinessCar();
	}

}

class BmwFactory extends AbstractFactory {
	@Override
	public SportCar createSportCar(String car) throws Exception {
		return new BmwSportCar();
	}

	@Override
	public BusinessCar createBusinessCar(String car) throws Exception {
		return new BmwBusinessCar();
	}
}

class AudiFactory extends AbstractFactory {
	@Override
	public SportCar createSportCar(String car) throws Exception {
		return new AudiSportCar();
	}

	@Override
	public BusinessCar createBusinessCar(String car) throws Exception {
		return new AudiBusinessCar();
	}
}

public class AbstractFactoryDemo {
	public static void main(String[] args) throws Exception {
		AbstractFactory d = new BenzFactory();
		SportCar car = d.createSportCar("Benz");
		car.setName("Benz");
		car.drive();
	}
}
