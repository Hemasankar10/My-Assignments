package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		
		// instantiate the browser driver
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		//load the url
		driver.get("https://en-gb.facebook.com/");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//click on create an account in facebook.com
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		//enter firstname and surname
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hemalatha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sankar");
		
		//enter mobile number or mail address
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123456789");
		
		//enter newpassword
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("hemasan");
		
		//handling all three buttons in DOB
		WebElement date=driver.findElement(By.name("birthday_day"));
		Select date1=new Select(date);
		date1.selectByValue("10");
		
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select month1=new Select(month);
		month1.selectByIndex(7);
		
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select year1=new Select(year);
		year1.selectByVisibleText("1999");
		
		//select the radio button in gender
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		//get title of the page
		String title=driver.getTitle();
		
	    System.out.println(title);
	    
	    //close the window
	    driver.close();

	}

}
