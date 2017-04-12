package observer;

public class ConcreteObserver extends Observer{

	private String name = null;
	private String state = null;
	
	public ConcreteObserver(String name, String state, Subject subject) {
		super(subject);
		this.name = name;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public void update() {
		state = subject.getState();
		System.out.print(name + "µÄÐÂ×´Ì¬ÊÇ" + state);
		
	}
	
	
}
