package proxy;

public class Proxy implements ISubject {
	
	private RealSubject real = null;
 
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		if(real == null){
			real = new RealSubject();
		}
		real.sayHello();
	}

}
