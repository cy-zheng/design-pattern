package pers.zcy.factorymethod;

public class OperationAdd extends Operation {

	@Override
	public double getResult() {
		return getNumA() + getNumB();
	}

}
