package week3.day2;

public class Chrome extends Browser {
	public void openIncognito() {
		System.out.println("opened incognito--->sub class");
	}
	
	public void clearCache() {
		System.out.println("clearing the cache--->sub class");
	}
	
	public static void main(String[] args) {
		
		Chrome c=new Chrome();
		c.clearCache();
		c.openIncognito();
		c.openURL();
		c.navigateBack();
		c.closeBrowse();
	}
}
