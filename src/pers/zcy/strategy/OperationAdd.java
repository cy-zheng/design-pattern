package pers.zcy.strategy;

public class OperationAdd extends Operation {

	@Override
	public double getResult() {
		return getNumA() + getNumB();
	}

}
