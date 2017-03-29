package pers.zcy.strategy;

public class StrategyDemo {
	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("Usage: java StrategyDemo operation num1 num2");
			return;
		}
		OperationContext oc = new OperationContext(args[0]);
		double result = oc.getResult(Double.parseDouble(args[1]), 
				Double.parseDouble(args[2]));
		System.out.println(result);
	}
}
