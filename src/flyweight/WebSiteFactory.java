package flyweight;

import java.util.HashMap;

public class WebSiteFactory {
	
	private static HashMap<String, WebSite> flyWeight = new HashMap<>();
	
	public static WebSite getWebSite(String type) {
		if(flyWeight.containsKey(type)){
			return flyWeight.get(type);
		}
		else{
			flyWeight.put(type, new WebSite(type));
			return flyWeight.get(type);
		}
	}
	
	public static int getSize() {
		return flyWeight.size();
	}

}
