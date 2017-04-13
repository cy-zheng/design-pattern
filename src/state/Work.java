package state;

public class Work {

	private int hour = 0;
	private boolean isFinished = false;
	private State state = new BeforeNoon();
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public boolean isFinished() {
		return isFinished;
	}
	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public void writeProgram() {
		state.writeProgram(this);
	}
	
}
