package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<>();
	private String state = null;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
		
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyAllObserver() {
		for(Observer observer : observers){
			observer.update();
		}
	}
}
