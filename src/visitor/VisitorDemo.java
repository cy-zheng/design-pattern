package visitor;

public class VisitorDemo {
	
	public static void main(String[] args) {
		PersonStructure pStructure = new PersonStructure();
		pStructure.addPerson(new Man());
		pStructure.addPerson(new Woman());
		
		State fail = new Fail();
		State marriage = new Marriage();
		
		pStructure.visitAll(fail);
		pStructure.visitAll(marriage);
	}

}
