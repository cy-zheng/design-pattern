package singleton;

public class LazySingleton2 {
	
	static LazySingleton2 instance;
	
	private LazySingleton2(){
		
	}
	
	public static LazySingleton2 getInstance(){
		if(instance == null){
			synchronized (LazySingleton2.class) {
				if(instance == null){
					instance = new LazySingleton2();
				}
			}
		}
		return instance;
	}

}
