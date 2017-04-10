package builder;

public class ConcreteBuilder1 extends Builder {

	@Override
	public void buildPartA() {
		product.add("part A");
	}

	@Override
	public void buildPartB() {
		product.add("part B");
	}

}
