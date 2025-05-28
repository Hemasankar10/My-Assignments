package week4.day1;

public class MethodOverLoading {

	public void reportStep(String msg, String status) {
		System.out.println("Message-Hello");
		System.out.println("status in progress");
	}
	
	public void reportStep(String msg, String status, boolean snap) {
		System.out.println("true");
	}
	
	public static void main(String[] args) {
		MethodOverLoading ol=new MethodOverLoading();
		ol.reportStep("message", "In progress");
		ol.reportStep("hello", "status still in progress", false);
	}
	
}
