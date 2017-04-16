package singleton;

public class HungrySingleton{
	
	static HungrySingleton instance = new HungrySingleton();
	
	private HungrySingleton(){
		
	}

	public static HungrySingleton getInstance(){
		return instance;
	}

}
