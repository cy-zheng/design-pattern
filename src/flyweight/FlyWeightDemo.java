package flyweight;

public class FlyWeightDemo {
	
	public static void main(String[] args) {
		WebSite wSite1 = WebSiteFactory.getWebSite("产品展示");
		WebSite wSite2 = WebSiteFactory.getWebSite("产品展示");
		WebSite wSite3 = WebSiteFactory.getWebSite("博客");
		wSite1.use("Mike");
		wSite2.use("John");
		wSite3.use("Jack");
		System.out.println(WebSiteFactory.getSize());
	}

}
