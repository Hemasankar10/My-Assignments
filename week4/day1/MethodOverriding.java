package week4.day1;

public class MethodOverriding extends MethodOverLoading {

	public void reportStep(String msg, String status, boolean snap) {
		System.out.println("overriding the msg from parent class");
		System.out.println("overriding the status from parent class");
		System.out.println("overriding the boolean value as true from parent class");
	}
	
	public static void main(String[] args) {
		MethodOverriding or=new MethodOverriding();
		or.reportStep("Welcome", "completed", true);
	}
}
