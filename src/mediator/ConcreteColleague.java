package mediator;

public class ConcreteColleague extends Colleague {
	
	private String name;

	public ConcreteColleague(Mediator mediator, String name) {
		super(mediator);
		this.name = name;
	}

	@Override
	public void send(String msg) {
		mediator.send(msg, this);
	}

	@Override
	public void invoke(String msg) {
		System.out.println("Colleague " + this.name + " receive a msg " + msg);
	}

}
