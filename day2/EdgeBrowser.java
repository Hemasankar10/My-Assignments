package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser diff = new Browser();
		String anotherName=diff.launchBrowser("edge");
		System.out.println(anotherName);
		diff.loadUrl();

	}

}
