package state;

public class StateDemo {
	
	public static void main(String[] args) {
		Work work = new Work();
		for(int hour = 8; hour < 22; hour++){
			work.setHour(hour);
			if(hour == 19){
				work.setFinished(true);
			}
			work.writeProgram();
		}
	}
	
}
