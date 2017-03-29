package pers.zcy.decorator;

public class Person extends Component {
	
	private String name = null;

	public Person(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("Œ“ «" + name);
	}
}
