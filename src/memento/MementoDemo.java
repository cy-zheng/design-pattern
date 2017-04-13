package memento;

public class MementoDemo {

	public static void main(String[] args) {
		Organizer organizer = new Organizer();
		organizer.setState("On");
		organizer.show();
		
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(organizer.createMemento());
		
		organizer.setState("Off");
		organizer.show();
		
		organizer.loadMemento(caretaker.getMemento());
		organizer.show();
		
	}
	
}
