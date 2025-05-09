package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
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
		
		//click on leads button
		driver.findElement(By.linkText("Leads")).click();
		
		//click on create lead button
		driver.findElement(By.linkText("Create Lead")).click();
		
		//enter firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("hemalatha");
		
		//enter lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("sankar");
		
		//enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("hcltech");
		
		//enter the title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SeleniumJava course");

		//select employee from source dropdown  using index method
		//for selecting a dropdown first need to locate the dropdown and store it in a local variable
		WebElement sourceDD =driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select1=new Select(sourceDD);
		select1.selectByIndex(4);
		
		//select automobile option from marketing campaign using visibleText method
		WebElement campaignDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select select2=new Select(campaignDD);
		select2.selectByVisibleText("Automobile");
		
		//select corporation option in ownershipDD using value method
		WebElement ownershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select select3=new Select(ownershipDD);
		select3.selectByValue("OWN_SCORP");
		
		//enter the title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SeleniumJava course");

		//click create lead button
		driver.findElement(By.className("smallSubmit")).click();
		
		//get title of the page
		String title=driver.getTitle();
		
	    System.out.println(title);
	    
	    //close the window
	    driver.close();	
		
	}

}
