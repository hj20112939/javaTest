package rtti;


public class AllObj {
	public static void getAllObj(Object obj){
		Class c = obj.getClass();
		System.out.println(c.getSimpleName());	
		Class sc = (Class) c.getGenericSuperclass();
		Class scc = (Class)sc.getGenericSuperclass();
		Class sccc = (Class)scc.getGenericSuperclass();
    
		for(Class ctemp : c.getClasses()){
			System.out.println(ctemp.getSimpleName());
		}
	}
	public static void main(String args[]){
		getAllObj(new PowerSteeringBelt());
	}
}
