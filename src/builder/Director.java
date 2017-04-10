package builder;

public class Director {
	
	private Builder builder = null;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public Product getProduct(){
		builder.buildPartA();
		builder.buildPartB();
		return builder.getResult();
	}
}
