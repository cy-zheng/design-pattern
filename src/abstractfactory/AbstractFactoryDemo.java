package abstractfactory;

public class AbstractFactoryDemo {
	
	public static void main(String[] args) {
		IUser user;
		IDepartment department;
		try {
			user = DataBase.getUserHandler();
			user.select();
			user.insert();
			department = DataBase.getDepartmentHandler();
			department.select();
			department.insert();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
