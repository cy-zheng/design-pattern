package composite;

public class CompositeDemo {
	
	public static void main(String[] args) {
		Composite root = new Composite("root");
		root.add(new Leaf("leaf1"));
		root.add(new Leaf("leaf2"));
		
		Composite composite1 = new Composite("composite1");
		composite1.add(new Leaf("leaf3"));
		composite1.add(new Leaf("leaf4"));
		composite1.add(new Leaf("leaf5"));
		root.add(composite1);
		
		Leaf leaf6 = new Leaf("leaf6");
		root.add(leaf6);
		root.delete(leaf6);
		root.show(1);
	}

}
