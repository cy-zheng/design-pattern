package singleton;

public class SingletonDemo {
	
	public static void main(String[] args) {
		HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
		HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
		System.out.println(hungrySingleton1 == hungrySingleton2);
		
		LazySingleton1 lazySingleton11 = LazySingleton1.getInstance();
		LazySingleton1 lazySingleton12 = LazySingleton1.getInstance();
		System.out.println(lazySingleton11 == lazySingleton12);
		
		LazySingleton2 lazySingleton21 = LazySingleton2.getInstance();
		LazySingleton2 lazySingleton22 = LazySingleton2.getInstance();
		System.out.println(lazySingleton21 == lazySingleton22);
		
	}

}
