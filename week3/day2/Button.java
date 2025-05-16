package week3.day2;

public class Button extends WebElement{

	public void submit() {
		System.out.println("click on submit button");
	}
	
	public static void main(String[] args) {
		Button but=new Button();
		but.click();
		String text1=but.setText("enter the text");
		System.out.println(text1);
		but.submit();
	}
	
}
