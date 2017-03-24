package innnerClasses;

public class Parcel7 {
	public Destination getDestination(String s){
		class DestinationImpl implements Destination{
			String label;
			public DestinationImpl(String s){
				label = s; 
			}
			@Override
			public String readLable() {
				return label;
			}	
		}
		return new DestinationImpl(s);	
	}
}
