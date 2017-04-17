package responsibilitychain;

public class ConcreteHandler1 extends Handler {

	@Override
	public void handleRequest(int requestLevel) {
		if(requestLevel < 10){
			String outMsg = this.getClass().getName() + " handle request " + Integer.toString(requestLevel);
			System.out.println(outMsg);
		}
		else{
			if(successor != null){
				successor.handleRequest(requestLevel);
			}
		}
	}
	
}
