package command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
	
	private List<Command> commands = new ArrayList<>();
	
	public void setOrder(Command command) {
		if (command.getClass() == BakeChickenWing.class){
			System.out.println("º¶≥·µ„ÕÍ¡À£°");
		}
		else{
			commands.add(command);
		}
	}
	
	public void cancelOrder(Command command) {
		commands.remove(command);
	}
	
	public void notifyWorker(){
		for(Command command : commands){
			command.invoke();
		}
	}

}
