package pers.zcy.factorymethod;

public class FactoryMethodDemo {
	public static void main(String[] args) {
		IFactory addFactory = new AddFactory();
		Operation add = addFactory.createOperation();
		add.setNumA(1.0);
		add.setNumB(2.0);
		System.out.println(add.getResult());
	}
}
