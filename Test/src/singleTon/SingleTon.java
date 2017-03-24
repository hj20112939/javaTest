package singleTon;

public class SingleTon {
	private static SingleTon singleTon= null;
	private SingleTon(){}
	public static SingleTon getInstance(){
		if(singleTon == null){
			synchronized(SingleTon.class){
				if(singleTon == null)
					singleTon = new SingleTon();
			}
		}
		return singleTon;
	}
}
