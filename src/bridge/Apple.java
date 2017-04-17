package bridge;

public class Apple extends PhoneBrand {

	@Override
	public void run() {
		System.out.println("Hello iPhone!");
		this.getSoftware().run();
	}

}
