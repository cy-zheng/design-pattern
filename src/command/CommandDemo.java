package command;

public class CommandDemo {
	
	public static void main(String[] args) {
		// ����ǰ��׼��
		Worker worker = new Worker();
		Command bakeChickenWing = new BakeChickenWing(worker);
		Command bakeMutton = new BakeMutton(worker);
		Waiter waiter = new Waiter();
		
		// ���
		waiter.setOrder(bakeMutton);
		waiter.setOrder(bakeChickenWing);
		waiter.setOrder(bakeMutton);
		waiter.cancelOrder(bakeMutton);
		
		// ����
		waiter.notifyWorker();
	}

}
