package singleton;

public class LazySingleton1 {
	
	static LazySingleton1 instance;
	
	private LazySingleton1(){
		
	}
	
	public synchronized static LazySingleton1 getInstance(){
		if(instance == null){
			instance = new LazySingleton1();
		}
		return instance;
	}

}
