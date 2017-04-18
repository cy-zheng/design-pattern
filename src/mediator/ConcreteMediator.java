package mediator;

public class ConcreteMediator extends Mediator{
	
	@Override
	public void send(String msg, Colleague from) {
		if (from == this.getColleague1()){
			this.getColleague2().invoke(msg);
		}
		else {
			this.getColleague1().invoke(msg);
		}
		
	}

}
