package innnerClasses.testC;

import innnerClasses.testA.InnerTestI;
import innnerClasses.testB.InnerTestClass;

public class InnerTestClassExtends extends InnerTestClass {
	public InnerTestI getInnerTestI(){
		return new InnerTestImpl();
	}
	public static void main(String args[]){
		InnerTestClassExtends test = new InnerTestClassExtends();
		System.out.println(test.getInnerTestI().getValue());
	}
}
