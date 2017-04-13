package state;

public class BeforeNoon extends State {

	@Override
	public void writeProgram(Work work) {
		if(work.getHour() < 12){
			System.out.println("������" + Integer.toString(work.getHour())+ "�㣬������");
		}
		else{
			work.setState(new Noon());
			work.writeProgram();
		}
	}

}
