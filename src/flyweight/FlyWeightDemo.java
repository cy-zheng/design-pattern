package flyweight;

public class FlyWeightDemo {
	
	public static void main(String[] args) {
		WebSite wSite1 = WebSiteFactory.getWebSite("��Ʒչʾ");
		WebSite wSite2 = WebSiteFactory.getWebSite("��Ʒչʾ");
		WebSite wSite3 = WebSiteFactory.getWebSite("����");
		wSite1.use("Mike");
		wSite2.use("John");
		wSite3.use("Jack");
		System.out.println(WebSiteFactory.getSize());
	}

}
