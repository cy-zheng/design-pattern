package mediator;

public abstract class Mediator {
	private Colleague colleague1;
	private Colleague colleague2;
	public Colleague getColleague1() {
		return colleague1;
	}
	public void setColleague1(Colleague colleague1) {
		this.colleague1 = colleague1;
	}
	public Colleague getColleague2() {
		return colleague2;
	}
	public void setColleague2(Colleague colleague2) {
		this.colleague2 = colleague2;
	}
	public abstract void send(String msg, Colleague from);

}
