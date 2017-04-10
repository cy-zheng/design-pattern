package builder;

public class BuilderDemo {
	public static void main(String[] args) {
		Builder c1 = new ConcreteBuilder1();
		Director d1 = new Director(c1);
		Product p1 = d1.getProduct();
		p1.show();
		
		Builder c2 = new ConcreteBuilder2();
		Director d2 = new Director(c2);
		Product p2 = d2.getProduct();
		p2.show();
	}
}
