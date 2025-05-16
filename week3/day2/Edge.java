package week3.day2;

public class Edge extends Browser {

	public void takeSnap() {
		System.out.println("taking a snap--->sub class");
	}
	
	public void clearCookies() {
		System.out.println("clearing the cookies--->sub class");
	}
	
	public static void main(String[] args) {
		Edge e=new Edge();
		e.clearCookies();
		e.takeSnap();
		e.openURL();
		e.navigateBack();
		e.closeBrowse();
		
	}
}
