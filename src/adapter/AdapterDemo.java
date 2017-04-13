package adapter;

public class AdapterDemo {
	
	public static void main(String[] args) {
		ISubject adapter = new Adapter();
		adapter.sayHello();
	}

}
