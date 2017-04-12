package abstractfactory;

public class MySQLUser extends IUser {

	@Override
	public void select() {
		System.out.println("MySQL select User");
	}

	@Override
	public void insert() {
		System.out.println("MySQL insert User");
	}

}
