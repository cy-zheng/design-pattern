package decorator;

public class DecoratorDemo {
	public static void main(String[] args) {
		Person person = new Person("Mike");
		Cloth tshirts = new TShirts(person);
		Cloth trousers = new Trouser(tshirts);
		trousers.show();
	}
}
