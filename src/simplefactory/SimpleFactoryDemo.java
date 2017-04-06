package simplefactory;

public class SimpleFactoryDemo {
	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("Usage: java StrategyDemo operation num1 num2");
			return;
		}
		Operation operation = OperationFactory.createOperation(args[0]);
		operation.setNumA(Double.parseDouble(args[1]));
		operation.setNumB(Double.parseDouble(args[2]));
		double result = operation.getResult();
		System.out.println(result);
	}
}
