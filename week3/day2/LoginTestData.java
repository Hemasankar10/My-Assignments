package week3.day2;

public class LoginTestData extends TestData {

	
	public void enterUserName() {
		System.out.println("Kindly enter the user name-->sub class");
	}
	
	public void enterPassword() {
		System.out.println("Kindly enter your password-->subclass");
	}
	
	public static void main(String[] args) {
		
		LoginTestData obj=new LoginTestData();
		obj.enterCredentials();
		obj.enterUserName();
		obj.enterPassword();
		obj.navigateToHomePage();
		
	}
}
