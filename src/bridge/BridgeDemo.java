package bridge;

public class BridgeDemo {
	
	public static void main(String[] args) {
		Software addressList = new AddressList();
		Software game = new Game();
		
		PhoneBrand apple = new Apple();
		apple.setSoftware(addressList);
		
		PhoneBrand nokia = new Nokia();
		nokia.setSoftware(game);
		
		apple.run();
		nokia.run();
	}

}
