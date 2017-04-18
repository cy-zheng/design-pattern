package visitor;

public class Marriage extends State {

	@Override
	public void visitMan(Man man) {
		System.out.println("Marriage makes man sad.");
	}

	@Override
	public void visitWoman(Woman woman) {
		System.out.println("Marriage makes woman happy");
	}

}
