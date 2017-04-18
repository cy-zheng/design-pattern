package flyweight;

public class WebSite {
	
	private String type;
	
	public WebSite(String type){
		this.type = type;
	}
	
	public void use(String user){
		System.out.println("WebSite's type is " + this.type + ". User is " + user + ".");
	}

}
