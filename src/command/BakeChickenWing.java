package command;

public class BakeChickenWing extends Command {

	public BakeChickenWing(Worker receiver) {
		super(receiver);
	}

	@Override
	public void invoke() {
		receiver.bakeChickenWing();
	}

}
