package abstractfactory;

public class OracleUser extends IUser {

	@Override
	public void select() {
		System.out.println("Oracle select User");
	}

	@Override
	public void insert() {
		System.out.println("Oracle insert User");
	}

}
