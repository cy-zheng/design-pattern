package simplefactory;

public class OperationFactory {
	public static Operation createOperation(String operation) {
		Operation oper = null;
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
		return oper;
	}
}
