package bridge;

public class Nokia extends PhoneBrand {

	@Override
	public void run() {
		System.out.println("Hello Nokia!");
		this.getSoftware().run();
	}

}
