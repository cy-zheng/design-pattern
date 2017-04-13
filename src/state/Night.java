package state;

public class Night extends State {

	@Override
	public void writeProgram(Work work) {
		if(work.isFinished()){
			System.out.println("������" + Integer.toString(work.getHour())+ "�㣬�°࣡");
		}
		else{
			System.out.println("������" + Integer.toString(work.getHour())+ "�㣬�Ӱ࣡");
		}
	}

}
