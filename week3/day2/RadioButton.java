package week3.day2;

public class RadioButton extends Button{

	public void selectRadioButton() {
		System.out.println("selecting the radio button");
	}
	
	public static void main(String[] args) {
	
		RadioButton rad=new RadioButton();
		rad.selectRadioButton();
		rad.click();
		String text3=rad.setText("welcome");
		System.out.println(text3);
		rad.submit();
	}

}
