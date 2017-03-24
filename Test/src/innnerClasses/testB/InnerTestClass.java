package innnerClasses.testB;

import innnerClasses.testA.InnerTestI;

public class InnerTestClass {
	protected class InnerTestImpl implements InnerTestI{
		public InnerTestImpl() {}
		public int getValue(){
			return 1;
		}
	}
}
