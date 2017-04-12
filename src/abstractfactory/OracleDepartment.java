package abstractfactory;

public class OracleDepartment extends IDepartment {

	@Override
	public void select() {
		System.out.println("Oracle select Department");
	}

	@Override
	public void insert() {
		System.out.println("Oracle insert Department");
	}

}
