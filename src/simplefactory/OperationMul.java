package simplefactory;

public class OperationMul extends Operation {

	@Override
	public double getResult() {
		return getNumA() * getNumB();
	}

}
