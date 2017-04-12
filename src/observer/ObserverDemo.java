package observer;

public class ObserverDemo {

	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		ConcreteObserver observer = new ConcreteObserver("����", "����Ӱ", subject);
		subject.attach(observer);
		
		subject.setState("�칤����");
		subject.notifyAllObserver();
	}
	
}
