package state;

public class AfterNoon extends State {

	@Override
	public void writeProgram(Work work) {
		if(work.getHour() < 17){
			System.out.println("现在是" + Integer.toString(work.getHour())+ "点，工作！");
		}
		else{
			work.setState(new Night());
			work.writeProgram();
		}
	}

}
