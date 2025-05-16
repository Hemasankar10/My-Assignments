package week3.day2;

public class TextField extends WebElement{

	public void gettext() {
		System.out.println("get the text from the user");
	}
	
	public static void main(String[] args) {
		TextField fields=new TextField();
		fields.click();
		String a=fields.setText("hello");
		System.out.println(a);
		fields.gettext();
	}
	
}
