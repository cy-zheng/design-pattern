package memento;

public class Memento {
	
	private String state = null;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

}
