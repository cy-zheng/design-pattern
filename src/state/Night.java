package state;

public class Night extends State {

	@Override
	public void writeProgram(Work work) {
		if(work.isFinished()){
			System.out.println("现在是" + Integer.toString(work.getHour())+ "点，下班！");
		}
		else{
			System.out.println("现在是" + Integer.toString(work.getHour())+ "点，加班！");
		}
	}

}
