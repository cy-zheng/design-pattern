package observer;

public class ObserverDemo {

	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		ConcreteObserver observer = new ConcreteObserver("老王", "看电影", subject);
		subject.attach(observer);
		
		subject.setState("快工作！");
		subject.notifyAllObserver();
	}
	
}
