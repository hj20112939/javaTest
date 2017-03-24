package innnerClasses;

public class Parcel8 {
	private class DestinationImpl implements Destination{
		@Override
		public String readLable() {
			return "test1";
		}
	}
	public DestinationImpl getDestinationImpl(){
		return new DestinationImpl();
	}
	public static void main(String args[]){
		Parcel8 p = new Parcel8();
		Destination d = p.getDestinationImpl();
		System.out.println(d.readLable());
	}
}
