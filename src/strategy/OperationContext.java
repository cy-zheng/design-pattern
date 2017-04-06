package strategy;

public class OperationContext {
	private Operation oper = null;
	
	public OperationContext(String operation) {
		switch (operation) {
		case "+":
			oper = new OperationAdd();
			break;
		case "-":
			oper = new OperationSub();
			break;
		case "*":
			oper = new OperationMul();
			break;
		case "/":
			oper = new OperationDiv();
			break;
		default:
			throw new IllegalArgumentException ("Unsupport operation!");
		}
	}
	
	public double getResult(double numA, double numB) {
		oper.setNumA(numA);
		oper.setNumB(numB);
		return oper.getResult();
	}
}
