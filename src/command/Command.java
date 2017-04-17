package command;

public abstract class Command {
	
	protected Worker receiver;

	public Command(Worker receiver) {
		this.receiver = receiver;
	}
	
	public abstract void invoke();
}
