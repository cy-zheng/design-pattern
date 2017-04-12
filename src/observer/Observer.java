package observer;

public abstract class Observer {
	
	protected Subject subject = null;
	
	public Observer(Subject subject) {
		this.subject = subject;
	}
	
	public abstract void update();
	
}
