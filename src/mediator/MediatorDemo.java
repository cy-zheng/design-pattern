package mediator;

public class MediatorDemo {
	
	public static void main(String args[]) {
		Mediator mediator = new ConcreteMediator();
		Colleague colleague1 = new ConcreteColleague(mediator, "Mike");
		Colleague colleague2 = new ConcreteColleague(mediator, "Sarah");
		mediator.setColleague1(colleague1);
		mediator.setColleague2(colleague2);
		
		colleague1.send("Hello! Nice to meet you!");
		colleague2.send("Hi! Nice to meet you too!");
		
	}

}
