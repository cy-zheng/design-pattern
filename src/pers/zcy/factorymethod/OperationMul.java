package pers.zcy.factorymethod;

public class OperationMul extends Operation {

	@Override
	public double getResult() {
		return getNumA() * getNumB();
	}

}
