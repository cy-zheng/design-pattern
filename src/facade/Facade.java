package facade;

public class Facade {
	
	private SuperSystem sub1 = null;
	private SuperSystem sub2 = null;
	private SuperSystem sub3 = null;
	
	public Facade() {
		sub1 = new SubSystem1();
		sub2 = new SubSystem2();
		sub3 = new SubSystem3();
	}
	
	public void methodA() {
		sub1.method();
		sub2.method();
	}
	
	public void methodB() {
		sub2.method();
		sub3.method();
	}
	
	public void methodC() {
		sub1.method();
		sub3.method();
	}
}
