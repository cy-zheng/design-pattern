package memento;

public class Organizer {

	private String state = null;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMemento() {
		return new Memento(state);
	}
	
	public void loadMemento(Memento memento) {
		state = memento.getState();
	}
	
	public void show() {
		System.out.println("State: " + state);
	}
}
