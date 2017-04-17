package command;

public class BakeMutton extends Command {

	public BakeMutton(Worker receiver) {
		super(receiver);
	}

	@Override
	public void invoke() {
		receiver.bakeMutton();
	}

}
