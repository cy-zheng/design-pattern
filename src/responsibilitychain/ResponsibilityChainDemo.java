package responsibilitychain;

public class ResponsibilityChainDemo {
	
	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		handler1.setSuccessor(handler2);
		handler2.setSuccessor(handler3);
		
		int[] requests = {1, 5, 11, 15, 29};
		for (int i : requests){
			handler1.handleRequest(i);
		}
	
	}

}
