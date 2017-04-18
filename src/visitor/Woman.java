package visitor;

public class Woman extends Person {

	@Override
	public void accept(State state) {
		state.visitWoman(this);
	}

}
