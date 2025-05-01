package week1.day2;

public class Browser {
	public String launchBrowser (String browserName) {
		System.out.println("Browser Launched Successfully");
		return browserName;
	}
	
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}	
	
	public static void main(String[] args) {
		Browser lm = new Browser();
		String name=lm.launchBrowser("chrome");
		System.out.println(name);
		lm.loadUrl();
		
	}
	
}
