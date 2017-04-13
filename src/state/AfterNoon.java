package state;

public class AfterNoon extends State {

	@Override
	public void writeProgram(Work work) {
		if(work.getHour() < 17){
			System.out.println("������" + Integer.toString(work.getHour())+ "�㣬������");
		}
		else{
			work.setState(new Night());
			work.writeProgram();
		}
	}

}
