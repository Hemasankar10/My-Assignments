package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) {
		//instantiate the browser driver
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		// load URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//to find and add inputs in username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//to find and add inputs in password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//to click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on crm/sfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//click on account tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//Click create account
		driver.findElement(By.linkText("Create Account")).click();
		
		//click on account name
		driver.findElement(By.id("accountName")).sendKeys("Hemalatha");
		
		//enter the description as Selenium Automation Tester.
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		//entering the number of employees
		driver.findElement(By.id("numberEmployees")).sendKeys("5");
		
		//find sitename and enter as LeafTaps
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		//Click on the create account button
		driver.findElement(By.className("smallSubmit")).click();
		
		//get title of the page
		String title=driver.getTitle();
		
	    System.out.println(title);
	    
	    //close the window
	    driver.close();
		
	}

}
