package pers.zcy.strategy;

public class OperationMul extends Operation {

	@Override
	public double getResult() {
		return getNumA() * getNumB();
	}

}
