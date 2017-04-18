package visitor;

public class Fail extends State {

	@Override
	public void visitMan(Man man) {
		System.out.println("Fail makes man depressed.");
	}

	@Override
	public void visitWoman(Woman woman) {
		System.out.println("Fail makes woman cried");
	}

}
