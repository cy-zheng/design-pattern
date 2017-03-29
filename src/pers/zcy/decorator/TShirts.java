package pers.zcy.decorator;

public class TShirts extends Cloth {

	public TShirts(Component component) {
		super(component);
	}

	@Override
	public void show(){
		super.show();
		System.out.println("Œ“¥©¡ÀT–Ù");
	}
}
