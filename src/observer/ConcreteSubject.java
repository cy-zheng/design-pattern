package observer;


public class ConcreteSubject extends Subject {
	
	@Override
	public void notifyAllObserver() {
		System.out.println("�ϰ��������");
		super.notifyAllObserver();
	}
	
}
