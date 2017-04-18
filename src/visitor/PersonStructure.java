package visitor;

import java.util.ArrayList;
import java.util.List;

public class PersonStructure {
	
	private List<Person> persons = new ArrayList<>();
	
	public void addPerson(Person person) {
		persons.add(person);
	}
	
	public void visitAll(State state) {
		for(Person person : persons){
			person.accept(state);
		}
	}

}
