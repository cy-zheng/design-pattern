package builder;

public class ConcreteBuilder2 extends Builder {

	@Override
	public void buildPartA() {
		product.add("part X");
	}

	@Override
	public void buildPartB() {
		product.add("part Y");
	}

}
