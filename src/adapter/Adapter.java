package adapter;

public class Adapter extends ISubject {
	
	private Adaptee adaptee = new Adaptee();

	@Override
	public void sayHello() {
		adaptee.hello();
	}

}
