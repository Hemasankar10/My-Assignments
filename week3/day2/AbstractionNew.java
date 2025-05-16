package week3.day2;

public class AbstractionNew extends ConcreteClass implements DatabaseConnection,Inter {

	public void connect() {
		System.out.println("Connection setup");
	}

	public void disConnect() {
		System.out.println("system disconnected");
	}

	public void execute() {
		System.out.println("code execution");
	}

	public void RestApi() {
		System.out.println("restapi course");
	}

	public void systemDesign() {
		System.out.println("design in progress");
	}
	
	
	public static void main(String[] args) {
		AbstractionNew data=new AbstractionNew();
		data.connect();
		data.seleniumJava();
		data.RestApi();
		data.systemDesign();
	}
	
	

}
