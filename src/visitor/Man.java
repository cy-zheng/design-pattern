package visitor;

public class Man extends Person {

	@Override
	public void accept(State state) {
		state.visitMan(this);
	}

}
