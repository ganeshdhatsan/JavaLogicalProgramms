package CallAbstractClassInDifferentWays;

import org.testng.annotations.Test;

public class ExecutionClass {

	private AbstractClass getInstance() {

		return new ImplementingClass();
	}
	
	public static void main(String[] args) {
		ExecutionClass e = new ExecutionClass();
		AbstractClass instance = e.getInstance();
		instance.abstractMethod();
	}

}
