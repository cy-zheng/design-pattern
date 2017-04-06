package decorator;

public class Trouser extends Cloth {

	public Trouser(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void show(){
		super.show();
		System.out.println("ÎÒ´©ÁË¿ã×Ó");
	}
}
