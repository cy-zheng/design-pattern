package command;

public class CommandDemo {
	
	public static void main(String[] args) {
		// 开店前的准备
		Worker worker = new Worker();
		Command bakeChickenWing = new BakeChickenWing(worker);
		Command bakeMutton = new BakeMutton(worker);
		Waiter waiter = new Waiter();
		
		// 点菜
		waiter.setOrder(bakeMutton);
		waiter.setOrder(bakeChickenWing);
		waiter.setOrder(bakeMutton);
		waiter.cancelOrder(bakeMutton);
		
		// 做菜
		waiter.notifyWorker();
	}

}
