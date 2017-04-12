package abstractfactory;

public class MySQLDepartment extends IDepartment {

	@Override
	public void select() {
		System.out.println("MySQL select Department");
	}

	@Override
	public void insert() {
		System.out.println("MySQL insert Department");
	}

}
