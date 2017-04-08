package template;

public abstract class AbstractClass {
	
	public void templateMethod() {
		primitiveMethod1();
		primitiveMethod2();
		System.out.println("templateMethod");
	}

	protected abstract void primitiveMethod1();

	protected abstract void primitiveMethod2();
}
