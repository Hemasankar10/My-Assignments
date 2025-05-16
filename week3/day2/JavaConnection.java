package week3.day2;

public class JavaConnection implements DatabaseConnection {

	
	public void connect() {
		System.out.println("Connenct to java");
	}

	
	public void disConnect() {
		System.out.println("Disconnect from java");
	}


	public void execute() {
		System.out.println("execute java");
	}

	public void getOutput() {
		System.out.println("get the output from console");
	}
	
	public static void main(String[] args) {
		JavaConnection val= new JavaConnection();
		val.connect();
		val.disConnect();
		val.execute();
		val.getOutput();
	}
}
