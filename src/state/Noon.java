package state;

public class Noon extends State {

	@Override
	public void writeProgram(Work work) {
		if(work.getHour() < 14){
			System.out.println("现在是" + Integer.toString(work.getHour())+ "点，午休！");
		}
		else{
			work.setState(new AfterNoon());
			work.writeProgram();
		}
	}

}
