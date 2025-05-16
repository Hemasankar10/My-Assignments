package week3.day2;

public class CheckboxButton extends Button {

	public void clickCheckbutton() {
		System.out.println("clicking the check button");
	}
	
	public static void main(String[] args) {
		CheckboxButton box=new CheckboxButton();
		box.click();
		box.clickCheckbutton();
		box.submit();
		String text2=box.setText("enter the text");
		System.out.println(text2);
	}

}
