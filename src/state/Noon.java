package state;

public class Noon extends State {

	@Override
	public void writeProgram(Work work) {
		if(work.getHour() < 14){
			System.out.println("������" + Integer.toString(work.getHour())+ "�㣬���ݣ�");
		}
		else{
			work.setState(new AfterNoon());
			work.writeProgram();
		}
	}

}
