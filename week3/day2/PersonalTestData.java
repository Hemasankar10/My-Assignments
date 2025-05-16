package week3.day2;

public class PersonalTestData extends LoginTestData {

	
	public void dateofBirth() {
		System.out.println("Enter the DOB -->sub class");
	}
	
	public void emailID() {
		System.out.println("Enter the mailID --> sub calss");
	}
	
	public static void main(String[] args) {
		
		PersonalTestData obj1=new PersonalTestData();
		obj1.dateofBirth();
		obj1.emailID();
		obj1.enterPassword();
		obj1.enterUserName();
		obj1.enterCredentials();
		obj1.navigateToHomePage();
		
	}
}
